/* 소스파일과 바이트코드(~.class)파일의 분리
 * 1) 프롬프트> javac {소스파일.java}
 *    => 위와 같이 컴파일 할 경우, 원본소스와 클래스 파일이 같은 폴더에 위치한다.
 *       이럴 경우, 소스파일이 많은 프로젝트(프로그램)일 때,  
 *       내가 만든 프로그램을 배포할 때 문제가 생긴다.
 *       왜냐하면, 소스는 제외하고 class 파일만 배포해야 하기 때문이다.
 *    => 해결방법?
 *       javac -d bin {소스파일.java}
 *       => -d bin 옵션을 줘서 소스와 class 파일을 분리했다.
 *     
 */
package step03;

public class Test01 {

  public static void main(String[] args) {
    System.out.println("Hello,");
    System.out.println("world!\n");

  }

}


