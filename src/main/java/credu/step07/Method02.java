/* 메서드 오버로딩 (Overloading)
 * => 메서드명이 동일한 메서드를 여러개 선언할 수 있다.
 * => 규칙 1) 파라미터의 갯수, 종류, 순서가 다르면 메서드명이 동일한 메서드를  선언할 수 있다. 
 *    규칙 2) 파라미터 변수 이름이 다를 경우  메서드명이 동일한 메서드를  선언할 수 없다.
 *    규칙 3) 리턴 타입이 다를 경우 메서드명이 동일한 메서드를  선언할 수 없다.
 *    
 */
package credu.step07;

public class Method02 {

  public static void main(String[] args) {
    
  }
  
  // 파라미터의 수가 다른 경우
  private static void test1 (int n1) { }
  private static void test1 (int n1, int n2) { }
  
  // 파라미터의 종류가 다른 경우
  private static void test2 (int n1) { }
  private static void test2 (double d1) { }
  
  // 파라미터의 데이터 형과 수는 같아도 순서가 다른 경우  
  private static void test3 (int n1, double d1) { }
  private static void test3 (double d1, int n1) { }
  
  // 파라미터의 변수 이름만 다른 경우
  private static void test4 (int a) { }
  //private static void test4 (int b) { } //컴파일 오류!
  
  // 리턴 타입만 다른 경우 :
  private static void test5 (int n) { }
  //private static int test5 (int n) { } //컴파일 오류
}

