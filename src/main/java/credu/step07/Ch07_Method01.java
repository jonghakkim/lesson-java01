/* 메서드 사용하기 - void method
 * => 반복되는 명령어(연산)을 간결하게 표현한다.
 * => 오버로딩 문법을 사용했다.
 */
package credu.step07;

public class Ch07_Method01{ 
  
  // void method 이다.
	public static void Prn(int a) {//a=10
		System.out.println("a=" + a);
	}		
	public static void Prn(char ch) {//ch ='B'
		System.out.println("ch=" + ch);
	}
	public static void Prn(char ch, char ch02) {
		System.out.println("ch=" + ch + " ch02= " + ch02);
	}
	public static void main(String[] args) {
		Prn(10); // 10을 받아서 출력하는 메소드		
		Prn('A');
		Prn('B');
		Prn('A','B');
	}
}













