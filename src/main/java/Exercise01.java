/*
 *  - 메서드명 : max
 *  - 기 능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
 *    만일 주어진 배열이 null 이거나 크기가 0인 경우 -999999를 반환한다.
 *  - 반환타입 : int
 *  - 매개변수 : int[] arr - 최대값을 구할 배열
 */
public class Exercise01 {
  
  static int max(int[] arr) {
    
    if (arr == null || arr.length == 0)
      return -999999; 
    
    int maxVal = arr[0]; 
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > maxVal) 
        maxVal = arr[i];
    }
    
    return maxVal;
  }
  
  public static void main(String[] args)
  {
    int[] data = {3,2,9,4,7};
    
    System.out.println(java.util.Arrays.toString(data));
    System.out.println(" :"+max(data)); // 최대값, 9
    System.out.println(" :"+max(null)); // 최대값, -999999
    System.out.println(" :"+max(new int[]{})); // 0 최대값 크기가 인 배열, -999999 
  }
  
}
