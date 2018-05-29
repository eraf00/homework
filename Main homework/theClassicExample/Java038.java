package theClassicExample;

import java.util.Scanner;

public class Java038 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®");
		String mys = s.next();
		s.close();
		System.out.println(mys.length());
	}
}