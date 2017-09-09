/* 반복문 for 연습
 * => 구구단 출력하기
 * 
 */
package credu.step05;

public class MultiFor {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 8; j++) {
				// j+1 => 2단부터 시작한다.
				// i   => 단에 1부터 9까지 곱해준다. 
				System.out.print(j + 1 + "*" + i + "=" + 
			           i * (j + 1) + "\t");
			}
			//하나의 단이 끝나면 줄을 바꿔준다.
			System.out.print("\n");
		}

	}

}
