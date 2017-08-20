/* 자바 프로그램을 표준 출력 장치로 출력하기
 * => System.out.println() : OGNL표기법 (Object Graph Navigation Language)
 * => System : 클래스
 * => out 객체 : System 클래스 안에 있는 하나의 필드
 * => print() : out 필드 안에 있는 메서드
 *    => 그냥 출력만 한다.
 * => println()
 *    => 출력하고 줄바꿈한다. 
 *    => "\n" String 필드에서 줄바꿈(enter)를 의미한다. 
 */
package step02;

public class Test06 {
  public static void main(String[] args) {
    System.out.print("Hello,");
    System.out.print("World!\n");
    
    System.out.println("Hello,");
    System.out.print("World!\n");
  }
}

