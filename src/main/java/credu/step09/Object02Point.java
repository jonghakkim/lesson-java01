/* 생성자 선언과 사용 II
 * 
 */
package credu.step09;

class Point02 {
  int x;
  int y;

  @Override
  public String toString() {
    return "Point [x=" + x + ", y=" + y + "]";
  }
}

public class Object02Point {

  public static void main(String[] args) {
    Point02 p1 = new Point02(); // 어? 생성자가 정의되지 않았는데?
    // 모든 클래스는  Object 클래스를 상속 받는다.
    // 부모클래스의 생성자가 호출된다. 클래스 필드는 자동으로 초기화된다.
    // 메서드에서 로컬변수는 초기화해야 사용할 수 있다.

    System.out.println(p1.toString());
  }

}
