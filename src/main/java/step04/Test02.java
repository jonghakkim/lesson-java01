/* 리터럴 - 논리 값 리터럴
 */
package step04;

public class Test02 {

  public static void main(String[] args) {
    System.out.println(true);
    System.out.println(false);
     
    if (true) System.out.println("참이다.");
    if (false) System.out.println("거짓이다.");
    
    // 조건식(if, while, do~while, for) 에는  논리값이 들어가는데
    // 자바에서는 논리값이 true, false 두 가지만 사용한다.
    // c나 다른 언어는 0, 1 도  논리값으로 인식하는 경우도 있다.
    //if (1) System.out.println("뭐지?"); //컴파일 오류!
    
  }

}
