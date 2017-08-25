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
    
    
    char c1 = 44032; // '가'의 유니코드 값 
    System.out.println(c1);
    // println() 에 char 타입의 값을 주면 유니코드로 인식한다.
    // 그래서 폰트 파일에서 해당 코드의 문자 그림을 찾아 화면에 뿌린다.
    System.out.println(44032);
    
    char c2 = 0xAC00; // '가'의 유니코드 값
    System.out.println(c2);
    
    char c3 = '헐'; // '헐'의 유니코드 값을 리턴한다.
      //작은 따옴표('')를 이용하면 문자의 유니코드 값을 알아 낼 수 있다.
    System.out.println(c3);
    
    char c4 = '\uAC00'; // '가'의 유니코드 값을 리턴한다.
    System.out.println(c4);
  }
}

