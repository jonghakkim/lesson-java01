package credu.step05;

//1. ���� ���� ����մϴ�. 
//2. �ٿ� ���߾� ĭ�� ����մϴ�. 
//3. j�� ���ڸ� ����غ��ϴ�. 
public class Pratice {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");

			for (int j = i; j <= i+3 ; j++) {
				if (i % 2 != 0)
					System.out.print("*");
				//System.out.print(j);
				// inner for������ i �� Ȧ���� ��쿡 '*'�� ����Ѵ�.
				// �ʵ� j�� ����� ���� �� �� �ִ�. 
			}
			System.out.println();
		}

	}

}
