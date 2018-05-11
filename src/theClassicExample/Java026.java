package javajdsf;

import java.util.Scanner;

public class Java026 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入星期几："); // 123456
		String n = input.next();
		input.close();
		char x=n.charAt(0);
		String z;
		switch (x) {
		case 'S':
			z = (n.charAt(1) == 'n' ? "是星期日" : "是星期六");
			break;
		case 'M':
			z = "星期一";
			break;
		case 'T':
			z = (n.charAt(1) == 'u' ? "是星期二" : "是星期四");
			break;
		case 'W':
			z = "星期三";
			break;
		default:
			z = "星期五";
		}
		System.out.println(z);
	}
}
