/* 간단히 테스트 할 경우에 명령 프롬프트를 사용해라.
 * 배포용으로는 사용하기 불편하다.
 * 
 * - 이클립스에서 설정하는 방법
 * 
 *   [Run] - [Run Configuration]
 *   => name : 해당 클래스인지 확인
 *   => Arguments 탭 ----> "Program argument"
 *   => "${string_prompt}" 입력하고 저장 
 * 
 * - 다음과 같이 실행해야 한다.
 * 
 * => java -cp bin credu.step06.Array02 0.24 0.06
 * 
 */
package credu.step06;

public class Array02 {
  public static void main(String[] args) {
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    
    System.out.println(a * b);
  }
}
