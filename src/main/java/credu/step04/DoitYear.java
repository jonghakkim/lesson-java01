package credu.step04;

import java.util.Scanner;

public class DoitYear {

	public static void main(String[] args) {
		// 1) 연산을 수행하기 위해 프롬프트로 값을 입력 받는다. 
		Scanner sc = new Scanner(System.in);
		System.out.println("Year ====> ");
		
		// 2) 프롬프트에 입력된 값을 가져온다.
		int year = sc.nextInt();
        
		// 윤년은 4, 400으로 로 나누어 떨어지고, 100으로 나누어 떨어지면 안 된다. 
		if (year % 4 == 0 &&
				year % 100 != 0 &&
				year % 400 == 0)
			System.out.println("윤년");
		else 
			System.out.println("평년");

	}

}
