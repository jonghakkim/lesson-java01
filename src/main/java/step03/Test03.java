/* 다른 클래스의 메서드 호출하기
 * => step03 패키지에 있는 Test02와 
 *    step03.others 에 있는 Test02는
 *    클래스명이 동일하다. 
 *    어떻게 실행시켜야 하지?
 * 
 * => 방법1) 패키지명.클래스명.메서드명
 *    => 예) step03.others.Test02.m1();
 *          step03.Test02.m1();
 * 
 * => 방법2) 상단에 import 선언 -> import 패키지명.클래스명;
 *          클래스 블록               -> 클래스명.메서드명;
 *        예) 패키지 바로 하단에
 *           "import step03.Test02;" 혹은
 *           "import step03.others.Test02;" 선언한다.
 *           .....
 *           main() 메서드에 "Test02.m1();" 호출하는 코드를 작성한다.
 *         
 */
package step03;

import step03.Test02;

public class Test03 {

  public static void main(String[] args) {
    
    // 다른 클래스에 있는 메소드 호출 방법 (OGNL) 
    // 패키지명.클래스명.메서드명;
    step03.others.Test02.m1();
    step03.Test02.m1();
    
  }

}
