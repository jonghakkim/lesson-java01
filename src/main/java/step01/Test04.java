package step01;

public class Test04 {

	public static void main(String[] args) { 
		int x = -10;
		int absX = x >= 0 ? x : -x;
		// - 삼항연산자 표기법 (문법)
		//   => (조건식)? true 일때 실행할 명령어 : false 일때 실행할 명령어;
		// - 예시.
		//   => (x >= 0) ? x   : -x;
		//                ---    ---
		//                true   false
		
		System.out.println(absX);
		
		int score = 50;
		
		//           (1) 50은 90보다 작기 때문에 false 가 실행된다.
		//           ------------
		char grade = score >= 90 ? 'A' : (score >= 80 ? 'B' : 'C');
		//                               -------------
		//                               (2) 50은 80보다 작기 때문에 false 가 실행된다.
		// (3) grade 에는 'C'가 할당되었다.
		System.out.println(grade);
	}

}


 