package credu.step05;

public class DoStatement {

	public static void main(String[] args) {
		int i = 1;
		
		// 블록은 최소한 한번 수행된다. 
		do {
			System.out.printf("%d\n", i);
			i++;
		} while (i <= 5); // 반드시 ";" 을 붙여줘야 한다. 
		                  // 조건문을 true 일 때까지 수행된다.
	}

}
