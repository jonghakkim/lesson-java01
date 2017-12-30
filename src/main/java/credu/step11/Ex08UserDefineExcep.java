/* 사용자 예외 처리 예제 - 적용 후 
 * 
 */
package credu.step11;

class UsersException extends Exception {
  public UsersException (String str) {
    super (str);
  }
}

class UserNotAuthorizedException extends UsersException {
  // UID
  private int id;
  // 사용자 이름
  private String name;
  // 생성자
  public UserNotAuthorizedException () {
    super ( "이 사용자는 존재하지 않습니다.");
  }
  public void setUid ( int i) {
    id = i;
  }
  public void setName (String user) {
    name = user;
  }
  public String getName () {
    return name;
  }
  public int getId () {
    return id;
  }
}

class UidOutOfBoundException extends UsersException {
  // UID의 상한
  private int hid;
  // 생성자 (인수는 UID 제한)
  public UidOutOfBoundException ( int i) {
    super ( "UID의 범위는 "+ 0 + " 에서 "+ i + "입니다.");
    hid = i;
  }
  public int getHid () {
    return hid;
  }
}

class NullUsersException extends UsersException {
  // 생성자
  NullUsersException () {
    super ( "사용자 목록이 존재하지 않습니다.");
  }
}

class UserList {
  private String [] users;
  void setUsers (String [] args) {
    users = args;
  }
  String [] getUsers () throws NullUsersException {
    if (users.equals ( null)) {
      throw new NullUsersException () ;
    }
    return users;
  }
  String getUser ( int uid) throws UsersException {
    if (users.equals ( null)) {
      throw new NullUsersException () ;
    } else if (uid <0 || uid >= users.length) {
      UidOutOfBoundException excep
      = new UidOutOfBoundException (users.length - 1);
      throw excep;
    }
    return users [uid];
  }
  
  int getUser (String user) throws UsersException {
    int uid = 0;
    if (users.length == 0) {
      throw new NullUsersException ();
    } else {
      for ( int i = 0; i <users.length; i++) {
        if (user.equals (users [i])) {
          uid = i;
          break;
        } else if (i == users.length - 1) {
          UserNotAuthorizedException excep
          = new UserNotAuthorizedException ();
          excep.setName (user);
          throw excep;
        }
      }
    }
    return uid;
  }
}


public class Ex08UserDefineExcep {
  public static void main(String[] args) {
    UserList obj = new UserList ();
    obj.setUsers (args);
    try {
      System. out .print ( "dominica ->");
      System. out .println (obj.getUser ( "dominica"));
      System. out .print ( "10 ->");
      System. out .println (obj.getUser (2));
    } catch (UsersException e) {
      System. out .println ( "");
      System. out .println (e);
      return;
    }
  }
}