package Test;

import java.util.Scanner;

public class Java05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int i = input.nextInt();
		input.close();
		int s = 0;
		while (i > 0) {
			s = s * 10 + i % 10;
			i /= 10;
		}
		System.out.print("�������Ϊ��" + s);
	}
}
