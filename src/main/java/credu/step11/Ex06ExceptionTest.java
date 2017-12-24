/*
 * while문 사용하여 계속 입력 받도록 수정하거나
 * 메인 메서드 아규먼트 받아 처리하도록 손 볼 것
 * 
 */
package credu.step11;

import java.util.Scanner;

public class Ex06ExceptionTest {
  public static void main(String[] args) {
    System. out .println ( "실행 시작");
    
    
    
    Scanner keyScan = new Scanner(System.in);
    try {
      int i, j = 100;
      System. out .println ( "j :"+ j);
      i = Integer. parseInt (keyScan.next());
      System. out .println ( "j / i :"+ j / i);
      // 0으로 나누면 예외가 throw가 된다.
      System. out .println ( "try 블록 종료");
    } catch (ArrayIndexOutOfBoundsException e) {
      System. out .println ( "예외 :"+ e);
      System. out .println ( "인수를 하나 입력하십시오.");
    } catch (NumberFormatException e) {
      System. out .println ( "예외 :"+ e);
      System. out .println ( "인수를 정수로 입력하십시오.");
    } catch (ArithmeticException e) {
      System. out .println ( "예외 :"+ e);
      System. out .println ( "인수를 0이 아닌 정수로 입력하십시오.");
    } catch (Exception e) {
      System. out .println ( "어떤 예외가 발생했습니다.");
      e.printStackTrace ();
    }
    System. out .println ( "실행 종료");
  }
}

