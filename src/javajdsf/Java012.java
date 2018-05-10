package javajdsf;

import java.util.Scanner;

public class Java012 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入本月利润："); // 123456
		long I = input.nextInt();
		input.close();
		double bonus;
		if (I <= 100000) {
			bonus = I * 0.1;
		} else if (I < 200000) {
			bonus = 10000 + (I - 200000) * 0.075;
		} else if (I < 400000) {
			bonus = 17500 + (I - 400000) * 0.05;
		} else if (I < 600000) {
			bonus = 275000 + (I - 600000) * 0.03;
		} else if (I < 1000000) {
			bonus = 335000 + (I - 1000000) * 0.015;
		} else {
			bonus = 339000 + (I - 100000) * 0.01;

		}
		System.out.println("应发放奖金总数："+bonus);
	}
}