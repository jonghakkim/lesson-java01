package credu.step04;

import java.util.Scanner;

public class DoitYear {

	public static void main(String[] args) {
		// 1) ������ �����ϱ� ���� ������Ʈ�� ���� �Է� �޴´�.
		Scanner sc = new Scanner(System.in);
		System.out.println("Year ====> ");
		
		// 2) ������Ʈ�� �Էµ� ���� �����´�.
		int year = sc.nextInt();
        
		// ������ 4, 400���� �� ������ ��������, 100���� ������ �������� �� �ȴ�. 
		if (year % 4 == 0 &&
				year % 100 != 0 &&
				year % 400 == 0)
			System.out.println("����");
		else 
			System.out.println("���");

	}

}
