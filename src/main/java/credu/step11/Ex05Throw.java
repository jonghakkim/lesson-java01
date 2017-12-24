/* throw?
 * => 예외를 명시적으로(일부러) 발생시킬 수 있다.
 * => 왜? 
 *    - 사용자가 정의한 예외를 처리하기 위해 사용한다. 
 *    - 프로그램을 하다 보면, 자바 예외 관련 class에 없는 예외를 처리할 경우가 생긴다. 
 *  
 */
package credu.step11;

public class Ex05Throw {
  public static void main(String[] args) {
    try {
      System. out .println("실행 시작");
      throw new IllegalAccessException();
    } catch (IllegalAccessException e) {
      System. out .println("예외 :" + e);
      System. out .println("실행 종료");
    }
  }
}
