/* 이스케이프 문자 
 * => 출력부분에 포함되어 특별한 기능을 수행하는 문자 
 * => 역슬려쉬가 붙는 문자
 */
package step04;

public class Test03 {

  public static void main(String[] args) {
    
    //System.out.println("ABC\b가각간"); // backspace
    System.out.println("ABC\t가각간"); // tab
    //System.out.println("ABC\n가각간"); // 라인피드
    //System.out.println("ABC\f가각간"); // 폼피드, 현재 커서에서 줄을 바꾼다.
    //System.out.println("ABC\r가각간"); // 커서를 처음으로 보낸다.
    //System.out.println("ABC\"가각간"); // double quote
    //System.out.println("ABC\'가각간");
    //System.out.println("ABC'가각간"); // single quote 는 역슬러쉬를 안 붙여도 된다.

    // 자바에서 디렉토리를 표현할 때 "\\" 보다 '/' 를 더 많이 선호한다.
    //System.out.println("C:\\workspace-coding\\bin\\step03\\others");
    System.out.println("C:/workspace-coding//bin/step03/others");
    
  }

}
