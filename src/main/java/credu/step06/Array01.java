/* 배열 복사하는 명령어
 * 
 * System.arraycopy(원본, 원본시작index,
 *                  대상, 대상시작index, 
 *                  원본 복사할 양)
 * 
 */
package credu.step06;

public class Array01 {
  public static void main (String[] arg) {
    int[] fromInt = {1,2,3,4,5,6,7};
    int[] toInt = new int[10];
    
    // fromInt 를 toInt 에 복사하라
    // fromInt 의 시작 위치는 1이고, toInt의 시작위치는 인덱스 3이다
    // 복사할 크기는 5이다.
    System.arraycopy(fromInt, 1, toInt, 3, 5);

    for(int i= 0; i < toInt.length; i++)
      System.out.printf("%3d", toInt[i]);
  }
}