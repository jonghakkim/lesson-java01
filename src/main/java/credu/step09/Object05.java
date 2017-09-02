package credu.step09;

class Car01 {
  String color;

  // 기본생성자를 만든다.
  public Car01() {
    this("white");
  }
  
  public Car01(String color) {
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

class MyCar01 extends Car01 {
  int price;
  
  //기본 생성자를 만든다.
  public MyCar01() {
    this(0);
  }
  
  public MyCar01(int price) {
    //super(); // 자동 실행된다. 
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

public class Object05 {

  public static void main(String[] args) {
    Car01 car = new Car01("Black");
    MyCar01 myCar = new MyCar01(1000);
    
    //myCar = car; //컴파일 오류!
    //myCar = (MyCar01)car; // 런타임 오류!
    
    if (myCar instanceof MyCar01) {
      System.out.println(myCar.getColor());
      System.out.println(myCar.getPrice());
      System.out.println(myCar.toString());
    }
    
    car = myCar;
    
    if (car instanceof MyCar01) {
      System.out.println(car.getColor());
      System.out.println(((MyCar01)car).getPrice());
      System.out.println(car.toString());
    }
    
    
  }

}
