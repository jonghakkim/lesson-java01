/* 다른 클래스에서 메서드 호출하기 II
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
 *    => 예) 패키지 바로 하단에
 *          "import step03.Test02;" 혹은
 *          "import step03.others.Test02;" 선언한다.
 *          .....
 *          main() 메서드에 "Test02.m1();" 호출하는 코드를 작성한다.
 *         
 */
package step03;

// 패키지는 다르지만 이름이 동일한 클래스는
// import 문으로 중복선언할 수 없다.
//import step03.Test02;
import step03.others.Test02;

// 패키지에 '*'를 사용하여 선언할 경우  
// 자기 자신이 포함되어 있는 패키지 내에서 우선 찾는다.
//import step03.others.*;

// import문을 사용할 경우, 되도록 가능하면 
// 호출하고자하는 클래스를 명확하게 지정해라.

public class Test04 {

  public static void main(String[] args) {
    Test02.m1();
    
  }

}
