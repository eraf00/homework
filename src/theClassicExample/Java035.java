package theClassicExample;

import java.util.Scanner;

public class Java035 {

	public static void main(String[] srgs) {
		int[] j = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("«Î ‰»Î ˝◊È:");
		for (int i = 0; i < 10; i++) {
			j[i] = input.nextInt();
		}
		input.close();
		int max = 0;
		int min = j[0];
		int a = 0, b = 0;
		for (int i = 0; i < 10; i++) {
			if (j[i] > max) {
				max = j[i];
				a = i;
			}
		}
		int temp;
		temp = j[0];
		j[0] = j[a];
		j[a] = temp;

		for (int i = 0; i < 10; i++) {
			if (j[i] < min) {
				min = j[i];
				b = i;
			}
		}
		temp = j[9];
		j[9] = j[b];
		j[b] = temp;
		for (int i = 9; i >= 0; i--) {
			System.out.print(j[i] + "  ");
		}
	}
}
