package credu.step05;

public class LoopController {
	// 루프문, 즉 반복문에서 사용되는 제어 명령에는 continue와 break가 있다.
	// 메서드에서 사용되는 제어문은 return 이 있다.
	// 메서드 중간에 return 을 만나면 해당 메서드를 빠져나간다. 
	public static void main(String[] arg) {
	  
		int i = 1;
		for (; i <= 10; i++) {	
			if( i % 2 == 0 )
				//return; // 메인메서드를 빠져 나간다. 메서드 블록 끝까지 가지 않는다.
				break; // 메서드 블록 끝까지 연산이 수행된다.
			  //continue; // 메서드 블록 끝까지 연산이 수행된다.
			System.out.printf("%d\n", i);
		}
		System.out.println("  Main ====");
	}
}
