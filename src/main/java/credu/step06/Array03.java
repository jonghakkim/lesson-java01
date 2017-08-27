/* 명령프롬프트 대신 Scanner 입력 클래스를 사용하라
 * 
 * 다음과 같이 실행한다.
 * 
 * => java -cp bin credu.step06.Array03
 * 
 */
package credu.step06;

import java.util.Scanner;

public class Array03 {
  public static void main(String[] args) {
    
    Scanner keyScan = new Scanner(System.in);
    
    System.out.println("=> a 값을 입력해 주세요?");
    double a = Double.parseDouble(keyScan.nextLine());
    
    System.out.println("=> b 값을 입력해 주세요?");
    double b = Double.parseDouble(keyScan.nextLine());
        
    System.out.println(a * b);
  }
}
