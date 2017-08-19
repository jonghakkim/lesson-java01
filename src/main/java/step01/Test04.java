package step01;

public class Test04 {

	public static void main(String[] args) {
		int x = -10;
		int absX = x >= 0 ? x : -x;
		//(조건식)? true 실행할 명령어 : false 실행할 명령어
		// (x >= 0) ? x : -x
		//           ---  ---
		//           true  false
		
		System.out.println(absX);
		
		int score = 50;
		char grade = score >= 90 ? 'A' : (score >= 80? 'B' : 'C');
		
		System.out.println(grade);
	}

}


 