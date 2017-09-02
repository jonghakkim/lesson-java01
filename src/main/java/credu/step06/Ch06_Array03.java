/* 다차원 배열 사용하기
 * 
 */
package credu.step06;

 public class  Ch06_Array03 {

	public static void main(String[] args) {

		int[][] myArrays = new int[3][]; 
		myArrays[0] = new int[] { 10,20,30 };
		myArrays[1] = new int[] { 40,50 };
		myArrays[2] = new int[] { 60,70,80,90 };

		for (int i = 0; i < myArrays.length; i++) {
			for (int j = 0; j < myArrays[i].length; j++) {
				System.out.printf("%5d", myArrays[i][j]);
			}
			System.out.println();
		} 
	}

}
