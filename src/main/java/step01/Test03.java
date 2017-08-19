package step01;

public class Test03 {

	public static void main(String[] args) {
		char c1, c2;
		
		int i;
		
		c1 = 'a';
		//c2 = c1 + 1;
		
		c2 = (char) (c1 + 1);
		c2 = ++c1;
		
		System.out.println(c2);
		
		i = 'B' - 'A';
		System.out.println(i);
		
		i = '2' -'0';
		System.out.println(i);
    
		float pi = 3.141592f;
		float shortPi = Math.round(pi * 1000) / 1000f;
		
		System.out.println(shortPi);
		System.out.println(Math.round(pi * 1000));
	}

}
