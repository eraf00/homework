package Test;

import java.util.Scanner;

public class Java05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个三位数：");
		int i = input.nextInt();
		input.close();
		int s = 0;
		while (i > 0) {
			s = s * 10 + i % 10;
			i /= 10;
		}
		System.out.print("反序输出为：" + s);
	}
}
