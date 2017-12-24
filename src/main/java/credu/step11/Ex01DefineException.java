/* Exception ?
 * => 프로그램  중단을 방지하기 위한 문법
 * => try {...} catch (Exception e) {...}
 * 
 */
package credu.step11;

public class Ex01DefineException {

  public static void main(String[] args) {
    int x=0;

    try {
      x = 10 / 0;
    } catch (ArithmeticException e) {
      System.out.println("0 으로 나눌 수 없습니다.");
      e.printStackTrace();
    }

  }

}
