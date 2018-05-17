package theClassicExample;

import java.util.Scanner;

public class Java030 {

	public static void main(String[] args) {
		int[] z = new int[10];
		int i = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("ÊäÈëÊı×é£º"); // 123456
		for (i = 0; i < 9; i++) {
			z[i] = input.nextInt();
		}
		input.close();
		for (i = 0; i < 9; i++) {
			z[i] = input.nextInt();
			System.out.println(z[i]);
		}
		for (int a = 0; a < i + 1; a++) {
			for (int b = 0; b < i - a + 1; b++) {
				int temp = 0;
				if (z[b + 1] < z[b]) {
					temp = z[b + 1];
					z[b + 1] = z[b];
					z[b] = temp;
				}

			}
		}

	}
}
