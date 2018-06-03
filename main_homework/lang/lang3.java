package lang;

import java.util.Scanner;

public class lang3 {
	public static void main(String[] args) {
		System.out.println("ÊäÈë×Ö·û´®");
		Scanner z = new Scanner(System.in);
		String b = z.nextLine();
		StringBuffer a = new StringBuffer("a");
		for (int i = 0; i < b.length(); i++) {
			char ch = b.charAt(i);
			if (b.indexOf(ch) != -1) {
			} else {
				a.append(ch);
			}
			System.out.print(a.toString());
		}
		System.out.println(a);
		z.close();
		/*	String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // a
			if (newStr.indexOf(ch) != -1) {
				continue;
			} else {
				newStr += ch;// newStr = "rhxda";
				System.out.println(newStr);
			}
		}
		System.out.println(newStr);
	}
		 * 
		 * */
		
	}
}
