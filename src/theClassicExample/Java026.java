package javajdsf;

import java.util.Scanner;

public class Java026 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������ڼ���"); // 123456
		String n = input.next();
		input.close();
		char x=n.charAt(0);
		String z;
		switch (x) {
		case 'S':
			z = (n.charAt(1) == 'n' ? "��������" : "��������");
			break;
		case 'M':
			z = "����һ";
			break;
		case 'T':
			z = (n.charAt(1) == 'u' ? "�����ڶ�" : "��������");
			break;
		case 'W':
			z = "������";
			break;
		default:
			z = "������";
		}
		System.out.println(z);
	}
}
