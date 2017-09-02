/* 메서드 사용법 
 * => OGNL 표기법 
 * => "." 을 이용하여 메서드와 필드에 접근한다.
 * => 다른 클래스에 정의된 메서드에 접근할 수 있다. 
 */
package credu.step07;

// 하나의 파일에 여러 개의 클래스를 만들 수 있다. 
// .class 파일은 물리적으로 2개가 만들어진다.
class MyClass{
	public static void Prn(){
		System.out.println(" 안녕");
	} 
}
 
public class Ch07_Method {

	public static void main(String[] args) {
	
		     Prn();//안녕하세요  
		     Disp();//반갑습니다.   안녕하세요 
		     
		     //다른 클래스의 메서드 호출하기
		     MyClass.Prn();//안녕

	}
	public static void Disp(){
		 System.out.println("반갑습니다." );
		 Prn();
	}
	public static void Prn(){
		System.out.println("안녕하세요");
	}

}
