package credu.step05;

//1. 먼저 줄을 출력합니다. 
//2. 줄에 맞추어 칸을 출력합니다. 
//3. j의 숫자를 출력해봅니다. 
public class Pratice {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");

			for (int j = i; j <= i+3 ; j++) {
				if (i % 2 != 0)
					System.out.print("*");
				//System.out.print(j);
				// inner for문에서 i 가 홀수인 경우에 '*'를 출력한다.
				// 필드 j를 출력해 보면 알 수 있다. 
			}
			System.out.println();
		}

	}

}
