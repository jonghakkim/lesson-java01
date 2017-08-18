/* 문자와 문자열
 * 
 */
class Test03 {
  
  public static void main(String[] arg) {
    
    char ch = 'A';
    //ch = 'AB'; //컴파일 오류! 문자필드에는 하나의 문자만 들어갈 수 있다.
                 // 두가지 이상의 문자는 문자열로 선언한다.

    String s1, s2;
    s1 = "AB";
    
    // 문자열은 + 연산자로 서로 연결한다. 
    s2 = "A" + "B";

    System.out.println(s1);
    System.out.println(s2);
  }

}