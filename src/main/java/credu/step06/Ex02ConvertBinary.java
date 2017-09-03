/* 배열 응용 II
 * => 배열을 이용하여 16진수를 2진수로 출력한다.
 * 
 */
package credu.step06;

public class Ex02ConvertBinary {

  public static void main(String[] args) {
    char[] hex = {'C','A','F','E'};
    
    String[] binary = {
        "0000","0001","0010","0011", // 0 ~ 3
        "0100","0101","0110","0111", // 4 ~ 7
        "1000","1001","1010","1011", // 8, 9, A, B
        "1100","1101","1110","1111"  // C, D, E, F
    };
    
    String result = "";
    
    for (int i = 0; i < hex.length; i++ ) {
      if (hex[i] > '0' && hex[i] < '9') {
        result += binary[hex[i]];
      } else {
        result += binary[hex[i]-'A'+10];
      }
      
      result += " ";
    }
    
    System.out.println("hex :" + new String(hex));
    System.out.println("binar :" + result);

  }

}
