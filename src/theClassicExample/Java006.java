package theClassicExample;

import java.util.Scanner;

public class Java006 {
	public static void main(String[] srgs) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("������m��ֵ:");
		int m = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("������n��ֵ:");
		int n = input2.nextInt();
		
		int z ,max=1,min=m*n;
		input1.close();input2.close();
		for (z=1,max=1; z <= m && z <= n; z++) {
			if (m % z == 0 && n % z == 0) {max=z;
			}
		}
		System.out.println("���Լ��:"+max);

		for ( z = m * n, min = m * n; z >= m && z >= n; z--) {
			if (z % m == 0 && z % n == 0) {
				min=z;
			}
		}
		System.out.println("��С������:"+min);
	}

}
