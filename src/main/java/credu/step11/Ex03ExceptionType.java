/* Exception 의 종류
 * => 런타임(Runtime), 예외(Exception), 에러(Error)
 * 
 */
package credu.step11;

public class Ex03ExceptionType {

  public static void main(String[] args) {
    // args 아규먼트를 사용할 경우, "IndexOutOfBoundsException" 예외가 발생할 수 있다.
    // 예외 처리를 하지 않았다. (런타임 예외; 실행오류)

    String className = "Ex03ExceptionType";
    
    try {
      // "ClassNotFoundException"이 발생하지 않도록 
      // 반드시 예외 처리를 한다. (예외; 컴파일 오류)
      System. out .println(Class.forName (className) + " 는 존재한다.");
      System. out .println("예외가 발생하지 않았다.");
    } catch (ClassNotFoundException e) {
      System. out .println("예외가 발생했다.");
      e.printStackTrace();
    }
  }

}
