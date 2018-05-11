package theClassicExample;

import java.util.Scanner;

public class Java025 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个五位正整数：");
		int i = input.nextInt();
		input.close();
		if (i % 10 == i / 10000 && (i % 100 - i % 10) / 10 == i / 1000 - (i / 10000) * 10)
			System.out.println("他是回文数!");
		else {
			System.out.println("他不是回文数!");
		}
	}
}
