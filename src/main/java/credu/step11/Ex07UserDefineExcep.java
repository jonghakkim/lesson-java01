/* 사용자 예외 처리 예제 - 적용 전 
 * 
 */
package credu.step11;

public class Ex07UserDefineExcep {
  class UserList {
    private String[] users;
    // 사용자의 배열을 할당
    void setUsers(String[] args) {
      // 배열의 참조 값 할당
      users = args;
    }
    // UID에서 사용자 이름을 검색
    String getUser( int uid) {
      return users[uid];
    }
    // 사용자 이름에서 UID를 취득
    int getUser (String user) {
      for ( int i = 0; i <users.length; i ++) {
        if (user.equals (users [i])) {
          return i;
        }
      }
      // 정수 값을 돌려 줄 필요가 있기 때문에,
      // 여기에서는 기본값은 0으로했다.
      return 0;
    }
  }

  public static void main(String[] args) {
    // 인스턴스화
    Ex07UserDefineExcep.UserList obj = (new Ex07UserDefineExcep()).new UserList();
    // 사용자 배열 세트
    obj.setUsers(args);
    System. out .print("dominica->");
    System. out .println(obj.getUser("dominica"));
    System. out .print("0 ->");
    System. out .println(obj.getUser(0));
  }
}



