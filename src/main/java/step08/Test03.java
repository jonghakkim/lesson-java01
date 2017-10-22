/* class 문법의 용도: 관련된 메서드를 묶는 용도 - 클래스 적용 후
 * => 메서드를 호출할 때 인스턴스 주소를 편리하게 받고 싶다면,
 *    인스턴스 메서드로 선언하라!
 * => 인스턴스의 변수를 다루는 메서드라면,
 *    인스턴스 메서드로 선언하라!
 * => 인스턴스 메서드는 메서드 선언 앞에 static을 붙이지 않는 것이다. 
 */
package step08;

public class Test03 {
    
  public static void main(String[] args) {
    Member m1 = new Member();
    Member m2 = new Member();
    Member m3 = new Member();
    
    // 인스턴스 메서드를 호출할 때는 반드시 그 메서드 앞에 인스턴스 주소를 줘야 한다.
    m1.init("홍길동", 100, 100, 100);
    m2.init("임꺽정", 90, 90, 90);
    m3.init("유관순", 80, 80, 80);
    
    m1.compute();
    m2.compute();
    m3.compute();
    
    m1.print();
    m2.print();
    m3.print();
  }

}
