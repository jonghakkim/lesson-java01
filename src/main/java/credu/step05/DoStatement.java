package credu.step05;

public class DoStatement {

	public static void main(String[] args) {
		int i = 1;
		
		// ����� �ּ��� �ѹ� ����ȴ�. 
		do {
			System.out.printf("%d\n", i);
			i++;
		} while (i <= 5); // �ݵ�� ";" �� �ٿ���� �Ѵ�.
		                  // ���ǹ��� true �� ������ ����ȴ�.
	}

}
