package theClassicExample;

import java.util.Scanner;

public class Java025 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����һ����λ��������");
		int i = input.nextInt();
		input.close();
		if (i % 10 == i / 10000 && (i % 100 - i % 10) / 10 == i / 1000 - (i / 10000) * 10)
			System.out.println("���ǻ�����!");
		else {
			System.out.println("�����ǻ�����!");
		}
	}
}
