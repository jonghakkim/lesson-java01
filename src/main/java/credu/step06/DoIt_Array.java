/* 배열의 응용
 * 
 */
package credu.step06;

public class DoIt_Array {
	public static void main(String[] args) { 

		int[] MyArray = new int[] { 10, 20, 30, 40, 50, 0, 0 };

		// 합과 평균 구하기
		for (int i = 0; i < MyArray.length - 1; i++) {
			MyArray[5] += MyArray[i]; // 합 구하기
			MyArray[6] = MyArray[5] / (MyArray.length - 2); //평균 구하기

		}

		// 계산 결과 출력하기
		for (int i = 0; i < MyArray.length; i++) {
			System.out.print(MyArray[i] + " ");
		}

	}

}
