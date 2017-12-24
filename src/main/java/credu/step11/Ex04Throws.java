/* throws ?
 * => 예외가 발생할 경우, try~ catch 를 위임하는 명령어
 * 
 */
package credu.step11;

public class Ex04Throws {
  public static void main(String[] args) {
    System. out .println("실행 시작");
    int i = 100, j = 0, k = 0;
    try {
      k = cal (i, j);
      System. out .println(k);
    } catch (ArithmeticException e) {
      System. out .println("예외 :" + e);
    }
    System. out .println("실행 종료");
  }
  
  // throws 키워드를 통해 예외 처리를 호출한 메서드에 위임하였다.
  static int cal( int i, int j) throws ArithmeticException {
    return i / j;
  }
}
