/* 가변인수(parameter) 사용하기
 * =>가변인수는 배열이다. 배열로 처리하듯이 코딩해라
 * 
 */
package credu.step07;

public class Method01 {

  public static void main(String[] args) {
    // 파라미터를 출력하는 메서드
    disp(10, 7, 8);
    disp(10, 7, 8, 1, 2);
    
    // 파라미터의 합을 구해 출력하라
    System.out.println("가변인수의 합 : " + sum(4, 10)); // 파라미터의 합을 구하는 메서드
    System.out.println("가변인수의 합 : " + sum(7, 2, 8, 11));
    System.out.println("가변인수의 합 : " + sum());
  }
  
  // 가변 인수는 배열과 동일하다.
  // void method
  private static void disp(int... num) {
    System.out.println("=> void method : 가변인수 처리");
    for (int i = 0; i < num.length; i++)
      System.out.println(num[i]);
  }
  
  // return method
  private static int sum(int... nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++)
      sum += nums[i];
    return sum;
  }
}
/* 한정자와 수식자
 * => 필드, 메서드, 클래스에 사용한다.
 * 1) 한정자 
 *    public(완전개방), protected(동일패키지, 자식클래스), 
 *    (default)(동일패키지), private (동일클래스)
 *    
 * 2) 수식자
 *    static(스태틱 메서드;스태틱필드 처리), abstract(추상 메서드; 구현위임), 
 *    final(override 불가), native(c등 다른 언어 사용),
 *    synchronized(크리티컬섹션;스레드)
 */
