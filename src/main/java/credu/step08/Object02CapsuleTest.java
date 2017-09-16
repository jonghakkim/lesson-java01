/* this 사용하기
 * => this(), super() 와 구별하기 
 * => 변수와 메서드는 다르다. 혼동하지 말 것!
 */
package credu.step08;

class Capsule {

  private int y;
  static private int x;
  
  void setY(int y) { //인스턴스 메서드에는 this변수가 숨겨져 있다.
                     //로컬필드와 인스턴스필드의 이름이 동일할 때 구분하기 위해 사용한다. 
    this.y = y;
  }
  
  int getY() {
    return y;
  }
  
  void method() {
    y *= 5;
    System.out.println("-- instance method() ----");
    System.out.println("y = " + y);
  }
  
  static void setX(int x) {
    Capsule.x = x;
  }
  
  static int getX() {
    return x;
  }
  
  static void method2() {
    x *= 5;
    System.out.println("-- static method2() ----");
    System.out.println("x = " + x);
  }
}

public class Object02CapsuleTest {

  public static void main(String[] args) {
    //인스턴스 멤버의 사용
    Capsule obj = new Capsule();
    //obj.y = 10; //컴파일 오류! private 으로 선언되서 외부에서 접근 불가
    obj.setY(10);
    obj.method();
    System.out.println("인스턴스 y = " + obj.getY());
    
    //스태틱 멤버의 사용
    //Capsule.x = 55;//컴파일 오류! private 으로 선언되서 외부에서 접근 불가
    Capsule.setX(55);
    Capsule.method2();
    System.out.println("스태틱 x = " + Capsule.getX());
  }
}





