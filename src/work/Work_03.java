package work;

import java.util.Scanner;

public class Work_03 {
	public static void main(String[] srgs) {

		Scanner input = new Scanner(System.in);
		System.out.println("������һ����������");
		int a = 1, s = 1, i = input.nextInt();
		input.close();
		for (; a <= i; a++) {
			s = s * a;
		}
		System.out.print(i + "�Ľ׳�Ϊ��" + s);
	}
}