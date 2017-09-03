/* 1) 1차원 배열 선언하고 사용하기
 * 2) for문을 사용하여 배열 출력하기 
 * 
 * => index : 배열의 각 요소에 접근하도록 도와주는 지시자(값)
 * => 배열 인덱스는 '0'부터 시작한다.
 */
package credu.step06; 

public class  Ch06_Array01{
	
	public static void main(String[] args) {	

		//int[] ar = new int[] { 10, 20, 30, 40, 50 };
	  int[] ar ={10,20,30,40,50}; // 자바는 세가지 방법 중 이 방법을 가장 많이 사용한다. 
	                              // 왜? => 코드가 간결하다. 주소 저장이라는 개념에 부합된다.
		//int ar[] ={10,20,30,40,50}; // c 에서 많이 사용하는 배열 선언 방법 
		
		System.out.println("ar의 요소의 개수 =" + ar.length); //이 명령어로 배열의 길이를 얻을 수 있다.
		for(int i =0; i<ar.length ;i++) 
		  System.out.println(ar[i]);
		
		System.out.println("============"); // 배열 반대로 출력하기
		for(int i =ar.length-1; i>=0 ;i--)
			System.out.println(ar[i]);
		
		for(int r : ar) { // for 블록 안에서 index를 사용하지 않을 때 사용하는 for 문법. 
			System.out.println(r);
		}		 
	}
}

