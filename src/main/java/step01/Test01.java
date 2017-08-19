package step01;

public class Test01 {

	public static void main(String[] args) {
		byte a, b, c;
		a = 10;
		b = 20;
		//c = a + b;// 컴파일 오류! int + int = int => byte  
		
		//c = (byte)a + b;// 컴파일 오류! byte + int = int + int = int => byte
		
		c = (byte)(a + b); // int + int => byte 형변환
		
		System.out.println(c);

	}

}
