/* 배열 사용하기
 * 
 */
package step05;

public class Test01 {

  public static void main(String[] args) {
    
    byte[] arr1;
    
    //byte arr1[]; // 컴파일 에러, 위와 동일한 필드 선언이다.
    
    //arr1 = 10; // 컴파일 에러, 배열로 정의된 필드는 주소를 담을 수 있다. 기본 데이터 리터럴을 담을 수 없다. 
    
    //arr1[0] = 10; //컴파일 에러, 배열은 선언과 함께 초기화 시켜줘야 사용할 수 있다. 선언만으로는 배열에 값을 넣을 수없다. 
    
    arr1 = null;
    //arr1[0] = 10; // 런타임 에러!, 컴파일 에러는 나지 않지만, 아직 배열 공간이 만들어지지 않아서 필드에 주소값이 들어가 있지 않다.
                  // 실행할 때 오류가 발생한다. 
    
    //int a = null; // 컴파일 에러, 기본 데이터 타입에는 null을 넣을 수 없다.
                    // null은 객체형으로 선언된 필드에만 넣을 수 있다.
        
    arr1 = new byte[3];
        
    //arr1[3] = 40; // 런타임에러! new byte[3] 이 명령은 메모리에 3개의 공간을 만든다.
                  // 인덱스의 범위는 0 부터 2까지 쓸 수 있다.  
    
    //byte[] arr5;
    //arr5 = {70, 20, 90}; //컴파일 오류! 이러한 문법은 없다.
    
    int[] arr5 = {70, 20, 90};
    System.out.println(arr5);
    
  }

}
