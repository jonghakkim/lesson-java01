package credu.step05;

public class LoopController {
	// ������, �� �ݺ������� ���Ǵ� ���� ��ɿ��� continue�� break�� �ִ�.
	// �޼��忡�� ���Ǵ� ����� return �� �ִ�.
	// �޼��� �߰��� return �� ������ �ش� �޼��带 ����������.
	public static void main(String[] arg) {
	  
		int i = 1;
		for (; i <= 10; i++) {	
			if( i % 2 == 0 )
				return; // ���θ޼��带 ���� ������. �޼��� ��� ������ ���� �ʴ´�.
				//break; // �޼��� ��� ������ ������ ����ȴ�.
			    //continue; // �޼��� ��� ������ ������ ����ȴ�.
			System.out.printf("%d\n", i);
		}
		System.out.println("  Main ====");
	}
}
