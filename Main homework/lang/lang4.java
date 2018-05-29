package lang;

import java.util.Scanner;

public class lang4 {
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		String a = str.next();
		StringBuffer z = new StringBuffer(a);
		if (z.reverse().toString().equals(a))
			System.out.print("这个数是回文数");
		else
			System.out.print("这个数是回文数");
		str.close();
	}
}
