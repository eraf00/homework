package java20180530;

import java.util.Scanner;

public class J37801 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String sca1 = sca.next();
		sca.close();
		System.out.print(sca1 + new StringBuffer(sca1).reverse());
	}
}
