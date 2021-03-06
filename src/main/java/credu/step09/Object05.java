/* 생성자 응용 II
 * => 기본생성자 문법
 *    public 클래스명() { } 
 * => this(), super() 생성자
 * 
 */
package credu.step09;

public class Object05 {
  class Car {
    String color;

    // 기본생성자를 만든다.
    public Car() {
      this("white");
    }
    
    public Car(String color) {
      this.color = color;
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
    
    //기본 생성자를 만든다.
    public MyCar() {
      this(0);
    }
    
    public MyCar(int price) {
      //super(); // 자동 실행된다. 
      this.price = price;
    }
    
    public MyCar(int price, String color) {
      super(color); 
      this.price = price;
    }

    public int getPrice() {
      return price;
    }

    public void setPrice(int price) {
      this.price = price;
    }

    @Override
    public String toString() {
      return "MyCar [price=" + price + ", color=" + color + "]";
    }
  }
  
  public static void main(String[] args) {
    Object05 obj = new Object05();
    
    Car car = obj.new Car("black");
    MyCar myCar = obj.new MyCar(1000);
    MyCar myCarBlue = obj.new MyCar(2000, "blue");
    
    if (myCar instanceof MyCar) {
      System.out.println(myCar.getColor());
      System.out.println(myCar.getPrice());
      System.out.println(myCar.toString());
    }

    
    System.out.println("==========================");

    //myCar = car; //컴파일 오류!
    //myCar = (MyCar)car; // 런타임 오류!

    car = myCarBlue;
    
    if (car instanceof MyCar) {
      System.out.println(car.getColor());
      System.out.println(((MyCar)car).getPrice());
      System.out.println(car.toString());
    }
    
  }
  
}
  
  
    
    /*
    Object05 obj = new Object05();
    
    Car car = obj.new Car("black");
    MyCar myCar = obj.new MyCar(1000);
    MyCar myCarBlue = obj.new MyCar(2000, "red");
    
    if (myCar instanceof MyCar) {
      System.out.println(myCar.getColor());
      System.out.println(myCar.getPrice());
      System.out.println(myCar.toString());
    }

    //myCar = car; //컴파일 오류!
    //myCar = (MyCar)car; // 런타임 오류!
    
    car = myCarBlue;
    
    if (car instanceof MyCar) {
      System.out.println(car.getColor());
      System.out.println(((MyCar)car).getPrice());
      System.out.println(car.toString());
    }
 
    
    
  }

}
 */