/* 클래스명, 변수명, 메서드명
 * => 클래스명의 첫문자는 대문자이다.
 * => 변수명, 메서드명의 첫문자는 소문자이다.  
 * 
 */
class Test02 {
  
  char varTest; // 캐멀 표기법 예시
  int ab;
  int c;

  public static void main(String[] arg) {
    char varTest;
    
    //varTest = ''; // 컴파일 오류! 문자로 선언한 변수에는 반드시 값을 지정해야 한다. 
                    // 공백이라도 넣어줘야 한다.
                    // 0 ~ 65536 숫자 모두에 문자가 할당되어 있기 때문이다.
                    // 문자 필드에서 0은 공백이다.
    varTest = 65;   // 문자는 십진수로 표현할 수 있다. 
    System.out.println(varTest); 
    
    char ch = '\u0041'; // 문자는 16진수로 표기할 수 있다.
    System.out.println(ch);

  }

}