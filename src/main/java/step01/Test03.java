/* 기본자료형 사용 III
 *  
 */
package step01;

public class Test03 {

	public static void main(String[] args) {
		char c1, c2;
		
		int i;
		
		c1 = 'a';
		//c2 = c1 + 1; // 컴파일 오류! char + 1 = int + 1 = int => char : 큰 자료형은 작은 자료형에 넣을 수 없다.
		
		c2 = (char) (c1 + 1); // char 로 형변환해서 int 결과값(c1+1)을 char 필드(c2)에 넣었다.
		
		// 문자는 10진수로 표시할 수 있고, c1(=a)는 십진수 97과 같다.
		// ++c1 은 98 이 되고, 이는 문자로 b이다.
		c2 = ++c1;
		
		// 그래서, b가 출력된다.
		System.out.println(c2);
		
		// 다음과 같이 문자는 십집수로 표시된다. 
		// '0' = 48, 'A' = 65, 'a' = 97 
		i = 'B' - 'A'; // 66 - 65 = 1 이 출력된다.
		System.out.println(i);
		
		i = '2' -'0'; // 50 - 48 = 2 이 출력된다.
		System.out.println(i);
    
		// 자바에서 사용하는 반올림 메소드(명령어) 는  Math.round() 이다.
		float pi = 3.141592f; // float 에 값을 넣을 때는 리터럴에 접미사 f를 반드시 붙인다.
		float shortPi = Math.round(pi * 1000) / 1000f;
		
		System.out.println(Math.round(pi * 1000)); // 3.141592 * 1000 = 3141.592 = 반올림해서 3142 가 된다.
		System.out.println(shortPi); // => 3142 / 1000 = 3.142
	}

}
