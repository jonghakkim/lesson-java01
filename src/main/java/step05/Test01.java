/* 배열 사용하기
 * 
 */
package step05;

public class Test01 {

  public static void main(String[] args) {
    
    byte[] arr1;
    //byte arr1[];
    
    //arr1 = 10; // 런타임에러
    //arr1[0] = 10; // 런타임에러
    arr1 = null;
    //arr1[0] = 10; // 런타임에러
    
    //int a = null;
    
    arr1 = new byte[3];
    arr1[3] = 40; // 런타임에러
    
    byte[] arr5;
    //arr5 = {70, 20, 90}; //컴파일 오류
  }

}
