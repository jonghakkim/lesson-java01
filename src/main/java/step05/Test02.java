/* 비트 이동 연산자 (>> , >>>, <<)
 * 
 */
package step05;

public class Test02 {

  public static void main(String[] args) {
    int a = 0b0000_1010;
    
    System.out.println(a);
    
    // 왼쪽 빈자리를 부호비트로 채운다.
    System.out.println(a >> 1); // 0000_0101|0 (= a / 2^1)
    System.out.println(a >> 2); // 0000_0010|10 (= a / 2^2)
    
    System.out.println(-10 >> 2); // 음수
    // 왼쪽 빈자리를 무조건 '0'으로 채운다.
    System.out.println(-10 >>> 2); // 양수
    
    // 오른쪽 빈자리를 무조건 '0'으로 채운다. 
    // <<< 이런 연산자는 없다.
    System.out.println(a << 1); // 0|0001_0100 (= a * 2^1)
    System.out.println(a << 2); // 00|0010_1000 (= a * 2^2)
    
  }

}
