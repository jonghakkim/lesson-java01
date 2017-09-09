/* 기본 자료형 사용
 * 
 */
package step01;

public class Test01 {

	public static void main(String[] args) {
		byte a, b, c;
		a = 10;
		b = 20;
		//c = a + b;// 컴파일 오류! int + int = int => byte : 큰 자료형은 작은 자료형에 넣을 수 없다.
		
		//c = (byte)a + b;// 컴파일 오류! byte + int = int + int = int => byte
		                  // : 큰 자료형은 작은 자료형에 넣을 수 없다.
		
	// 그럼 해결 방법은? int + int => int : 결과값을 byte 형변환해서 넣는다.
		c = (byte)(a + b);
		
		System.out.println(c);
 
	}

}
