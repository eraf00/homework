package lang;

import java.util.Scanner;

public class lang4 {
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		String a = str.next();
		StringBuffer z = new StringBuffer(a);
		if (z.reverse().toString().equals(a))
			System.out.print("������ǻ�����");
		else
			System.out.print("������ǻ�����");
		str.close();
	}
}
