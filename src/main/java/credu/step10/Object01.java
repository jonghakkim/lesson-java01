/* 추상 클래스
 * 
 */
package credu.step10;

abstract class Shape {
  protected double area;
  public abstract double getArea();
}

class Rectangle extends Shape {
  double length;
  double width;
  public Rectangle (double l, double w) {
    length = l;
    width = w;
  }
  
  @Override
  public double getArea() {
    area = length * width;
    return area;
  }  
}

class Circle extends Shape {
  double radius;
  public Circle(double r) {
    radius = r;
  }
  
  @Override
  public double getArea() {
    area = 3.14 * (radius * radius);
    return area;
  }  
}

public class Object01 {
  public static void main(String[] args) {
    System.out.println("The area is :");
    
    Shape[] my_shape = new Shape[] { new Rectangle(4, 5),
                                     new Circle(5) };
    
    for (Shape s : my_shape) {
      if (s instanceof Circle) {
        System.out.println("Circle area : " + s.getArea());
      }else {
        System.out.println("Rectangle area : " + s.getArea());
      }
      
    }
  }
}
