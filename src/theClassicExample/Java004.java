package javajdsf;

import java.util.Scanner;

public class Java004 {
	public static void main(String[] srgs) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个正整数：");
		int score = input.nextInt();
		input.close();
		int m = 0, a = 2, n = score;
		int[] i = new int[n];
		for (; a < score;) {
			if (n % a == 0) {
				i[m] = a;
				n = n/a;
				m++;
			} else {
				a++;
			}
		}
		if (m > 0)
			System.out.print(score + "=" + i[0]);
		for (int z = 1; z <m; z++) {
			System.out.print("*" + i[z]);
		}
	}
}
