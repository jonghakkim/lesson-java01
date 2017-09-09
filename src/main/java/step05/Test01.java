/* 비트 논리 연산자 응용
 * 
 */
package step05;

public class Test01 {

  public static void main(String[] args) {
    
    int aPerson = 0b111; // 이 사람은 읽기, 쓰기, 실행 권한이 있다.
    int bPerson = 0b101; // 읽기 권한이 있다.
    int cPerson = 0b001; // 실행 권한만 있다.

    // 논리연산자 "&"는 필터링 기능이 있어서 '1'인 비트는 그냥 통과시킨다.
    final int READ = 0b100;
    final int WRITE = 0b010;
    final int EXEC = 0b001;
    
    // 누가 쓰기 권한이 있는지 검사할 수 있다.
    System.out.println((aPerson & WRITE) == WRITE);
    System.out.println((bPerson & WRITE) == WRITE);
    System.out.println((cPerson & WRITE) == WRITE);
    
    // 누가 실행 권한이 있는지 검사한다.
    System.out.println((aPerson & EXEC) == EXEC);
    System.out.println((bPerson & EXEC) == EXEC);
    System.out.println((cPerson & EXEC) == EXEC);
    
  }

}
