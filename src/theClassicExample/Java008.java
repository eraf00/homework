package theClassicExample;

import java.util.Scanner;

public class Java008 {
	public static void main(String[] srg) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("正整数的值:");
		Scanner input2 = new Scanner(System.in);
		System.out.println("项数：");
		int z, s, i = input2.nextInt();
		int[] a = new int[i];
		s = a[0];
		a[0] = input1.nextInt();
		input1.close();
		input2.close();
		for (z = 0; z <= i; z++) {
			a[z + 1] = 10 * a[z] + a[0];
			s += a[z + 1];
		}
		System.out.println("前" + i + "项的和为：" + s);
	}

}
