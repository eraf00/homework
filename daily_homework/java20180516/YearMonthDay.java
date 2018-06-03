package java20180516;

import java.util.Scanner;

public class YearMonthDay {
	public static void main(String[] srgs) {
		int[] i = new int[3];
		System.out.println("依次输入年，月，日：");
		Scanner input = new Scanner(System.in);
		for (int j = 0; j < 3; j++) {
			i[j] = input.nextInt();
		}
		int year = i[0];
		int month = i[1];
		int day = i[2];
		input.close();
		if (year < 0 || month < 0 || month > 12) {
			switch (month) {
			case 1:
				if (day > 31)
					aerror();
				break;
			case 3:
				if (day > 31)
					aerror();
				break;
			case 5:
				if (day > 31)
					aerror();
				break;
			case 7:
				if (day > 31)
					aerror();
				break;
			case 8:
				if (day > 31)
					aerror();
				break;
			case 10:
				if (day > 31)
					aerror();
				break;
			case 12:
				if (day > 31)
					aerror();
				break;
			case 4:
				if (day > 30)
					aerror();
				break;
			case 6:
				if (day > 30)
					aerror();
				break;
			case 9:
				if (day > 30)
					aerror();
				break;
			case 11:
				if (day > 30)
					aerror();
				break;
			case 2:
				if (year % 400 == 0 || (year % 100 != 0 || year % 4 == 0)) {
					if (day > 29)
						aerror();
				} else if (day > 28) {
					aerror();
				}
				break;

			}
		} else {
			System.out.println(i[0] + "年" + i[1] + "月" + i[2] + "日");
		}
	}

	private static void aerror() {
		System.out.println("非法输入,请用户重新输入：");
	}
}
