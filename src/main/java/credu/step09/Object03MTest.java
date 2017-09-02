/* 상속
 * 
 */
package credu.step09;

public class Object03MTest {

  public static void main(String[] args) {  

    BB b1 = new BB();//AA()-> BB()
    b1.setA(100);
    b1.setB(50);
    System.out.println(b1.getA() + "+ " 
        + b1.getB() + "=" + b1.getHap());

    BB b2 = new BB(200,250);//AA(200)-> BB(200,250)   
    System.out.println(b2.getA() + "+ " 
        + b2.getB() + "=" + b2.getHap());
  }

}

