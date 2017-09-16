/* 클래스 안에서 사용되는 멤버의 종류
 * => 스태틱, 인스턴스 멤버
 * => 둘은 같은 멤버끼리 따로 따로 논다. 되도록이면 섞어 쓰지 않는다.
 * => 멤버?
 *    => 필드와 메서드 
 */
package credu.step08;

class FieldTest {
  int y;
  static int x;
  
  void method() {
    y = 5 + x;  // 인트턴스는 스태틱 멤버와도 논다.
                // 하지만 되도록 같이 쓰지 마라
                // 인스턴스는 인스턴스멤버끼리, 스태틱은 스태틱 멤버끼리 사용하라.
    System.out.println("-- instance method()----");
    System.out.println("y = " + y);
  }
  
  static void m2 () {
    x += 6;
    //y += 1; // 컴파일 오류
              // static은 같은 스태틱 멤버(필드, 메서드)끼리 논다.
    
    System.out.println("-- static method()----");
    System.out.println("x = " + x);
  }
}

public class Object01MFieldTest {

  public static void main(String[] args) {
    // 스태틱 멤버의 사용방법
    // => 클래스명.스태틱필드
    // => 클래스명.스태틱메서드
    FieldTest.x = 55;
    System.out.println("static field x = " + FieldTest.x);
    FieldTest.m2();
    
    // 인스턴스 멤버의 사용방법
    // => new 명령어로 객체 생성
    // => 생성객체.인스턴스필드
    // => 생성객체.인스턴스메서드
    FieldTest obj = new FieldTest(); //스태틱 멤버가 인스턴스 멤버와 어울리는 방법
    obj.y = 10;
    System.out.println("instance field y = " + obj.y);
    obj.method();
    
    System.out.println("-- main() ----");
    System.out.println("y = " + obj.y);
  }

}
