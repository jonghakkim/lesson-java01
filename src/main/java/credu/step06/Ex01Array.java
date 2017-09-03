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
    
    int[] ball = new int[45];
    
    Random random = new Random();
    
    for (int i = 0; i < ball.length; i++) {
      ball[i] = i + 1;
    }
    
    int temp = 0;
    int j = 0;
    
    for (int i = 0; i < 100; i++) {
      //j = (int)(Math.random() * 45); // 매번 실행할 때마다 다른 값이 나온다
      j = random.nextInt(44);
      temp = ball[0];
      ball[0] = ball[j];
      ball[j] =temp;
      
    }
    
    for (int i =0; i < 6; i++) {
      System.out.print(ball[i] + " ");
    }
  }

}
