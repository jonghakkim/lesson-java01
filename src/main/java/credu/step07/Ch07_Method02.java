/* 메서드 사용하기 II - return method
 * => 장점
 *    - 코드가 간결해서 다른 사람이 봐도 이해하기 쉽고 보기 편한다. 
 *    - 그래서 유지보수하기가 쉽다.
 */
package credu.step07;

public class Ch07_Method02 {

  // return method 이다.
  public static int getY(int[] ar) {
    // 로컬 필드라고 부른다.
    int sum = 0;
    for (int i = 0; i < ar.length; i++) {
      sum += ar[i];
    }
    return sum;
  }
  
  
  public static int getX(int a, int b) {
    return (a + b);
  }

  public static int getA() {
    return 10;
  }

  public static float getF() {
    return 98.7f;
  }
  
  
  public static void main(String[] args) {
		int a = getA();  // 아하! int 를 반환하는 함수구나, 직관적으로 알 수 있다.
		System.out.println("a=" + a); // 10
		
		float f = getF(); // 아하, flaot 을 리턴하는 하는 함수구나~
		System.out.println("f=" + f);// 98.7f

		int hap = getX(100, 200); // 메서드와 필드를 선언할 때 메서드명, 필드명을 그냥 막 짓지 말라~ 
		                          // 다른 사람이 소스를 봤을 때 이해할 수 있어야 한다.  
		System.out.println("hap =" + hap);

		
		int[] ar = { 10, 20, 30, 40 , 50, 60, 70, 80};
		int sum = getY(ar);
		System.out.println("sum =" + sum);
		
		int[] ar02 = { 10, 20, 30, 40 };
		
		
		//int sum02 = getY(ar02);
		//System.out.println("sum02 =" + sum02);
		
		// 출력문에 메서드를 바로 넣어서 출력할 수 있다. 
		System.out.println("sum02 =" + getY(ar02));
	}
}
