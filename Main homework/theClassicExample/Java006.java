package theClassicExample;

import java.util.Scanner;

public class Java006 {
	public static void main(String[] srgs) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("正整数m的值:");
		int m = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("正整数n的值:");
		int n = input2.nextInt();
		
		int z ,max=1,min=m*n;
		input1.close();input2.close();
		for (z=1,max=1; z <= m && z <= n; z++) {
			if (m % z == 0 && n % z == 0) {max=z;
			}
		}
		System.out.println("最大公约数:"+max);

		for ( z = m * n, min = m * n; z >= m && z >= n; z--) {
			if (z % m == 0 && z % n == 0) {
				min=z;
			}
		}
		System.out.println("最小公倍数:"+min);
	}

}
