/* 리터럴 - 부동 소수점과 유효자릿수
 * 
 */
package step04;

public class Test01 {
  
  public static float xxx = 12.375f;
  
  public static void main(String[] args) {
    
    // float 형은 4바이트 메모리를 사용한다. 
    // 이를 단정도(single precision; 한개의 정밀도)라고 부른다.
    System.out.println(987.645f);
    System.out.println(999.9999f);
    System.out.println(9.999999f);
    System.out.println(999999.9f); // float은 7자리가 유효자릿수이다.
    System.out.println(999.99999f);
    
    // double형은 8바이트 메모리를 사용한다.
    // 이를 double precision(배정도; 단정도 보다 두 배 정밀하다)
    System.out.println(99999.9999999999);// double은 15자리가 유효자리수이다.
    System.out.println(99999.999999999999); // 경우에 따라 어떤 숫자는 16, 17자리까지 유효한 경우도 있다.
     // 그러나 실무에서는 최소개념을 적용하여 15자리를 유효자리수로 본다.
    
    System.out.println(987.654f); 
    
    // 부동소수점 표기법
    // => 소수점이 부양하여 움직임을 표현하기 위해 "부동소수점"이라 부른다.
    // => 고정소수점E지수값, 고정소수e지수값
    //    예) 3.14 = 31.4E-1(31.4 * 10**-1) = 0.314e1(0.314 * 10**1) 
    System.out.println(98.7654E1f); // 98.7654 * 10**1
    System.out.println(9.87654E2f); // 9.87654 * 10**2
    System.out.println(9876.54E-1f); // 9876.54 * 10**-1
    System.out.println(98765.4E-2f); // 98765.4 * 10**-2
    
  }
}
