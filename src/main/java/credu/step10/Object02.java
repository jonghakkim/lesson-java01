/* 인터페이스
 * 
 */
package credu.step10;

interface Countable {
  int getCount();
  void setCount(int count);
}

class Dog implements Countable {
  private int counter;

  @Override
  public int getCount() {
    return counter;
  }

  @Override
  public void setCount(int count) {
    this.counter = count;    
  }
}

class Car implements Countable {
  private int number;
  
  @Override
  public int getCount() {
    return number;
  }

  @Override
  public void setCount(int count) {
    this.number = count;
  }
}

public class Object02 {

  public static void main(String[] args) {
    Countable[] objs = {new Dog(), 
                        new Car()};
    objs[0].setCount(10);
    objs[1].setCount(2);
    
    for (int i = 0; i < objs.length; i++) {
      System.out.println(objs[i].getCount());
    }

  }

}
