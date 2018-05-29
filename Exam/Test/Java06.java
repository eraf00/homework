package Test;

import java.util.Scanner;

public class Java06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// 3564
		System.out.print("输出一个新数:");
		int i = input.nextInt();
		input.close();
		int[] z = new int[4];
		for (int j = 0; j < 4; j++) {
			z[j] = i % 10;
			i /= 10;
		}
		for (int j = 0; j < 4; j++) {
			for (int y = 0; y <3-j; y++) {
				if (z[y] > z[y + 1]) {
					int temp;
					temp = z[y];
					z[y] = z[y + 1];
					z[y + 1] = temp;
				}
			}
		}
		System.out.print(z[0] + z[1] * 10 + z[2] * 100 + z[3] * 1000);
	}
}
