/* 논리 연산자: &&와 ||의 연산 원리 
 * => 논리 연산자의 연산원리는  조건에 따라 필드에 값을 할당할 때 응용할 수 있다.
 * => if 문 보다 코드가 더 간결해 진다.
 *  
 */
package step04;

public class Test06 {

  public static void main(String[] args) {
    boolean a = true, 
    b = false;
    
    boolean result = a && (b = true);
    System.out.printf("a=%b, b=%b, result=%b%n", a, b, result);//결과 : a=true, b=true, result=true

    a = false;
    b = false;
    result = a && (b = true);// 앞의 피연산자가 false이기 때문에 뒤의 식 (b = true) 수행하지 않는다. 
    System.out.printf("a=%b, b=%b, result=%b%n", a, b, result); // 결과 : a=false, b=false, result=false

    a = false;
    b = false;
    result = a || (b = true);// a 값이 false 이기 때문에  뒤의 식까지 수행해봐야 결과를 알 수 있다. 
    System.out.printf("a=%b, b=%b, result=%b%n", a, b, result); // 결과 : a=false, b=true, result=true

    a = true;
    b = false;
    result = a || (b = true);// a 값이 true 이기 때문에  결과는 true 이다. 따라서 뒤의 식은 수행하지 않는다. 
    System.out.printf("a=%b, b=%b, result=%b%n", a, b, result); // 결과 : a=true, b=false, result=true
  }

}
