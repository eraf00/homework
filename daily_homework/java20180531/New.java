package java20180531;

import java.util.Calendar;
import java.util.Scanner;

public class New {
	public static void main(String[] args) {
		Scanner year0 = new Scanner(System.in);
		System.out.print("��������ݣ�");
		int year = year0.nextInt();
		Calendar cal = Calendar.getInstance();
		year0.close();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.DATE, 1);
		String[] month = { "һ", "��", "��", "��", "��", "��", "��", "��", "��", "ʮ", "ʮһ", "ʮ��" };
		for (int i = 0; i < 12; i++) {
			cal.set(Calendar.MONTH, i);
			int maxday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			int weekday = cal.get(Calendar.DAY_OF_WEEK);
			System.out.println("\t\t\t" + year + "" + month[i] + "�µ�����");
			System.out.println("��\tһ\t��\t��\t��\t��\t��");
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
