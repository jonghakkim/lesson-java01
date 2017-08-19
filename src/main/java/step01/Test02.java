package step01;

public class Test02 {

	public static void main(String[] args) {
		int a, b;
		long c;
		
		a = 1000000;
		b = 2000000;
		
		c = a * b; // int * int = int => long : int 계산 결과값을 long 에 넣었다. 들어가 진다.
		           // 하지만, 이미 계산 결과값이 int 의 범위(약 20억)를 벗어나 있다.
		           // 그래서 원하는 결과가 들어가지 않고 오버플로우가 발생한 값이 들어갔다.
		
		System.out.println(c);
		
		// 그럼 해결방법은 ? 
		// 피연산자 하나를 형변환해서 계산 결과가 long이 되도록 만든다.
		c = (long)a * b; // long * int = long => long : long을 long 에 넣도록 바꾸었다. 
		
		System.out.println(c);

	}

}
