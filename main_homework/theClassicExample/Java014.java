package theClassicExample;

import java.util.Scanner;

public class Java014 {
	public static void main(String[] args) {
		System.out.println("请依次输入年月日：");
		int[] Month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int year = 0;
		int month = 0;
		int day = 0;
		Scanner scanner = new Scanner(System.in);
		for (int z = 0; z < 3; z++) {
			switch (z) {
			case 0:
				year = scanner.nextInt();
				continue;
			case 1:
				month = scanner.nextInt();
				continue;
			case 2:
				day = scanner.nextInt();
				continue;
			}
		}
		scanner.close();
		if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0)
			Month[1] += 1;
		int i = day;
		for (int j = 0; j < month; j++) {
			i += Month[j];
		}
		System.out.println("这一天是这一年的第" + i + "天");
	}
}
