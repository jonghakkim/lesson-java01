/* 배열 응용 I
 * => 배열을 이용하여 1 ~ 45 까지 번호가 새겨진 공 중에서  6개의 공을 뽑아낸다.  
 * 
 * Random seed 사용하기
 * => Random random = new Random(5L);
 *                               --
 *                                => seed값
 *                                => 실행할 때마다 매번 같은 값을 가져온다.
 *                                => seed값을 안 주면 매번 다른 값을 가져온다.
 * random.nextBoolean();   // true or false
 * random.nextFloat();     // range : 0.0f ~ 1.0f(exclusive)
 * random.nextInt();       // all 2^32 possible int values
 * random.nextInt(100);    // range : 0 ~ 99
 */
package credu.step06;

import java.util.Random;

public class Ex01Array {

  public static void main(String[] args) {
    // 45개의 정수값을 저장하기 위한 배열 생성.
    int[] ball = new int[45];

    Random random = new Random();

    // 배열의 각 요소에 1~45의 값을 저장한다. 
    for (int i = 0; i < ball.length; i++) {
      ball[i] = i + 1; // ball[0]에 1이 저장된다.
    }

    int temp = 0;  // 두 값을 바꾸는데 사용할 임시변수 
    int j = 0;  // 임의의 값을 얻어서 저장할 변수 

    // 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다. 
    // 일반적으로 두배 정도 돌리면 완전히 랜덤하게 섞인다. 공이 45개면 90번 이상 반복하면 된다. 
    for (int i = 0; i < 100; i++) {
      //j = (int)(Math.random() * 45); // 매번 실행할 때마다 다른 값이 나온다
      j = random.nextInt(44);
      temp = ball[0];
      ball[0] = ball[j];
      ball[j] =temp;

    }

    // 배열 ball의 앞에서 부터 6개의 요소를 출력한다.
    for (int i =0; i < 6; i++) {
      System.out.print(ball[i] + " ");
    }
  }

}
