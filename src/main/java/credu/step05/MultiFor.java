package credu.step05;

public class MultiFor {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 8; j++) {
				// j+1 => 2�ܺ��� �����Ѵ�.
				// i   => �ܿ� 1���� 9���� �����ش�.
				System.out.print(j + 1 + "*" + i + "=" + 
			           i * (j + 1) + "\t");
			}
			//�ϳ��� ���� ������ ���� �ٲ��ش�.
			System.out.print("\n");
		}

	}

}
