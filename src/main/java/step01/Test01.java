package step01;

public class Test01 {

	public static void main(String[] args) {
		byte a, b, c;
		a = 10;
		b = 20;
		//c = a + b;// ������ ����! int + int = int => byte  
		
		//c = (byte)a + b;// ������ ����! byte + int = int + int = int => byte
		
		c = (byte)(a + b); // int + int => byte ����ȯ
		
		System.out.println(c);

	}

}
