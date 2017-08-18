/* 필드명
 * => 캐멀표기법, 길이제한이 없다.
 * => 상수필드는 대문자와 '_'로 표기한다.
 */
class Test01 {

  public static void main(String[] arg) {

	// final 이 붙은 필드는 상수이다.
	// 상수는 필드명을 모두 대문자로 선언한다.
    final int MAX_INT = 100;

    // 상수로 선언한 필드는 값을 변경할 수 없다.
    //MAX_INT = 200; 컴파일 에러

    int score = 100;
    System.out.println(score);
    
    String str = new String("abc");
    System.out.println(str);
    
    // java 는 필드명에 특수문자 "_", "$" 두가지만 허용한다.
    // "캐멜(camel) 표기법"을 사용하여 필드명을 정의하기 때문에 의미를 충분히 전달할 수 있다.
    // 길이 제한도 없다. 왠만하면 필드명과 메서드명에 특수문자를 사용하지 말라.
    int S$arp = 10;
    
  }

}