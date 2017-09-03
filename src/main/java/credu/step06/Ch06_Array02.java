/* 2차원 배열 사용하기
 * 
 */
package credu.step06;

 public class  Ch06_Array02 {
	public static void main(String[] args) {
		int ar[][] = new int[][]{
		    {10, 10, 10, 10, 0},
				{30, 30, 30, 30, 0},
				{40, 40, 40, 40, 0}, 
				{50, 50, 50, 50, 0}, 
				{0, 0, 0, 0, 0}};
						
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%5d", ar[i][j]);
			}
			System.out.println(); 
		}

		// 각 행의 마지막 열에 해당 행의 모든 값을 합친 값 저장하기
		// 마지막 행에 각 열의 모든 값을 합친 값 저장하기
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = 0; j < ar[i].length - 1; j++) {
				ar[i][4] += ar[i][j];
				ar[4][j] += ar[i][j];
				if (i == j)
					ar[4][4] += ar[i][j];
			}
		}
    
		// 계산 결과 출력하기
		System.out.println(" == 계산 후===");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%5d", ar[i][j]);
			}
			System.out.println();
		}
	}
}




