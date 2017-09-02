/* 다른 클래스의 필드와 메서드 사용하기
 * => 같은 패키지 안에 있는 클래스의 필드와 메서드를 호출하는 방법
 *    "클래스명.필드명"
 *    "클래스명.메서드명" 으로 호출할 수 있다. 
 *    => 스태틱 필드와 메서드만 이 방법을 사용한다.
 */
package credu.step07;

public class DoITMethod { 

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		Calc.Hap(a, b);
		Calc.Sub(a, b);
		Calc.Mul(a, b);
		Calc.Div(a, b);
	}

}
