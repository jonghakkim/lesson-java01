/* catch 사용법
 * => 작은 범위부터 큰 범위로 catch 문을 작성한다.
 * 
 * +- java.lang.Throwable
 *      |
 *      +- java.lang.Exception
 *           |
 *           +- java.lang.RuntimeException
 *                |
 *                +- java.lang.IllegalArgumentException
 *                     |
 *                     + - java.lang.NumberFormatException
*/
package credu.step11;

import java.util.Scanner;

public class Ex02UseCatch {

  public static void main(String[] args) {

    int r = 0;

    Scanner keyScan = new Scanner(System.in);
 
    try {
      r = Integer.parseInt(keyScan.next());
    } catch (NumberFormatException e) {
      System.out.println(e.toString());
    } catch (IllegalArgumentException e) {
      System.out.println(e.toString());
    } catch (RuntimeException e) {
      System.out.println(e.toString());
    } finally {
      System.out.println("File, DB 등 프로세스 종료 단계에서 반드시 실행해줘야 하는  코드가 위치");
      System.out.println("무조건 실행되는 블록");
    }

    System.out.println("r = " + r);
  }

}
