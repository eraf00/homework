package javajdsf;

import java.util.Scanner;

public class Java029 {
	public static void main(String[] srgs) {
		System.out.println("���������");
		int[][] a = new int[3][3];
		int i;
		int j;
		for (i = 1; i <= 3; i++) {
			for (j = 1; j <= 3; j++) {
				Scanner input1= new Scanner(System.in);
				a[i][j] = input1.nextInt();
				input1.close();
			}
		}

		System.out.println("3*3����Խ���Ԫ��֮��:" + a[1][1] + a[3][3]);

	}
}