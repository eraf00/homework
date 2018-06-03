package java20180531;

import java.util.Calendar;
import java.util.Scanner;

public class New {
	public static void main(String[] args) {
		Scanner year0 = new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = year0.nextInt();
		Calendar cal = Calendar.getInstance();
		year0.close();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.DATE, 1);
		String[] month = { "一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二" };
		for (int i = 0; i < 12; i++) {
			cal.set(Calendar.MONTH, i);
			int maxday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			int weekday = cal.get(Calendar.DAY_OF_WEEK);
			System.out.println("\t\t\t" + year + "" + month[i] + "月的日历");
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			for (int j = 1; j < weekday; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= maxday; j++) {
				System.out.print(j + "\t");
				if ((j + weekday - 1) % 7 == 0) {
					System.out.println();
				}
			}
			System.out.println("\n");
		}
	}
}
