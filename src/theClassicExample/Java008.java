package theClassicExample;

import java.util.Scanner;

public class Java008 {
	public static void main(String[] srg) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("��������ֵ:");
		Scanner input2 = new Scanner(System.in);
		System.out.println("������");
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
		System.out.println("ǰ" + i + "��ĺ�Ϊ��" + s);
	}

}
