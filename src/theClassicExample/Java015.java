package javajdsf;

import java.util.Scanner;

public class Java015 {
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("ÇëÊäÈëx£¬y£¬zµÄÖµ:");
		int x = input1.nextInt();
		Scanner input2 = new Scanner(System.in);
		int y = input2.nextInt();
		Scanner input3 = new Scanner(System.in);
		int z = input3.nextInt();
		input1.close();input2.close();input3.close();
		for (int i = 0, m; i <= 2; i++) {
			if (x > y) {
				m = y;
				y = x;
				x = m;
			}
			if (y > z) {
				m = z;
				z = y;
				y = m;
			}
		}

		System.out.println(x + ";" + y + ";" + z);
	}
}