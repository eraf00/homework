package lang;

import java.util.Scanner;

public class lang8 {
	public static void main(String[] args) {
		System.out.println("请输入一个八进制数:");
		Scanner ba = new Scanner(System.in);
		String ba8 = ba.next();
		char[] chba = ba8.toCharArray();
		char[] chba2 = new char[3 * ba8.length()];
		for (int i = 0; i < ba8.length(); i++) {
			chba2[3 * i] = (char) ((chba[i] - '0') / 4);
			chba2[3 * i + 1] = (char) ((chba[i] - 4 * chba2[3 * i] - '0') / 2);
			chba2[3 * i + 2] = (char) (chba[i] % 2);
		}
		System.out.print("八进制" + ba8 + "转换为二进制是：");
		for (int i = new String(chba2).indexOf(1); i < 3 * ba8.length(); i++) {
			System.out.print((int) chba2[i]);
		}

		System.out.print("\n八进制" + ba8 + "转换为十进制是：");
		int chba10 = 0;
		for (int i = 0; i < ba8.length(); i++) {
			chba10 += chba[i] * Math.pow(10, ba8.length() - 1 - i);
		}
		System.out.println(chba10);
		System.out.print("\n八进制" + ba8 + "转换为十进制是：");
		System.out.print("八进制" + ba8 + "转换为二进制是：" + Conversation(ba.nextInt(), 8, 2));
		
		ba.close();
	}

	String zhuanhuan(int a, int b) {

		return " ";
	}

	static long Conversation(long A, int B, int C) {
		int A0 = (int)A,z=0;
		while (true) {
			if (A0 / 10 != 0) {
				z++;
				A0 /= 10;
			} else
				break;
		}
		double in = 0;
		long out = 0;
		for (int i = 0; i <z; i++) {
			in += (double) z * Math.pow(Double.valueOf(B), z - 1 - i);
		}
		double j = 1, in0 = in;
		while (true) {
			if (in0 / 10 != 0) {
				j++;
				in0 /= 10;
			} else
				break;
		}
		for (int i = 0; i < j; i++) {
			out += in % C;
			in /= 10;
		}
		return out;
	}
}