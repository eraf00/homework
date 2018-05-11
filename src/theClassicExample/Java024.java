package theClassicExample;

import java.util.Scanner;

public class Java024 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个正整数："); // 123456
		int i = input.nextInt();
		input.close();
		int s = 0;
		int j = 0;
		while (i > 0) {
			s = 10 * s + i % 10;
			i = i / 10;
			j++;
		}
		System.out.println("它是" + j + "位数" + "\n" + "逆序:" + s);
	}
}