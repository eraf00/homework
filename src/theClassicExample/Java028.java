package theClassicExample;

import java.util.Scanner;

public class Java028 {
	public static void main(String[] args) {
		int[] z = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个数组："); // 123456
		int i = 0;
		for (i = 0; i <= 9; i++) {
			z[i] = input.nextInt();
		}
		input.close();
		for (int a = 0; a <= i - 1; a++) {
			for (int b = 0; b <= i - a - 1; b++) {
				int temp = 0;
				if (z[b] > z[b + 1]) {
					temp = z[b + 1];
					z[b + 1] = z[b];
					z[b] = temp;
				}
			}
		}
		for (i = 0; i < 10; i++) {
			System.out.print(z[i] + "  ");
		}

	}
}