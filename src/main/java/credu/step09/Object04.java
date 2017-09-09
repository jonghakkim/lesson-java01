/* 생성자 응용
 * => 기본생성자 문법
 *    public 클래스명() { } 
 * => this(), super() 생성자
 * 
 */
package credu.step09;

class Car {
  String color;

  // 자식 클래스 MyCar는 부모클래스의 기본생성자를 호출한다.
  // 부모클래스의 기본 생성자를 지우면 에러 발생한다.
  public Car() {
    System.out.println("생성자 Car() 호출");
  }


  public Car(String color) {
    this.color = color;
    System.out.println("생성자 Car(String) 호출");
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Car [color=" + color + "]";
  }
}

class MyCar extends Car {
  int price;


  public MyCar() {
    this(0);
    System.out.println("생성자 MyCar() 호출");
  }

  public MyCar(int price) {
    //super(); // 컴파일러가 자동으로 기본생성자를 붙여서 실행한다.
    // 클래스를 만들 때 되도록 기본 생성자를 만들어라 
    this.price = price;
    System.out.println("생성자 MyCar(int) 호출");
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }


}

public class Object04 {

  public static void main(String[] args) {
    MyCar myCar = new MyCar(100);

  }

}
