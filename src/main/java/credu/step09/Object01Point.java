/* 생성자 선언과 사용
 * 
 */
package credu.step09;

class Point {
  int x;
  int y;

  public Point() {
    // 방법 1
    x = 0;
    y = 0;

    // 방법 2
    //this(0, 0); //컴파일 에러! 생성자 안에서 호출하는 this() 생성자는 제일 먼저 호출해야 한다. 
  }

  Point (int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "Point [x=" + x + ", y=" + y + "]";
  }
}

public class Object01Point {

  public static void main(String[] args) {
    Point p1 = new Point();
    Point p2 = new Point(10, 20);
    System.out.println(p1.toString());
    System.out.println(p2.toString());
  }

}
