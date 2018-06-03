package lang;

import java.util.Scanner;

public class lang6 {
	public static void main(String[] args) {
		Scanner zimu = new Scanner(System.in);
		String zimu1 = zimu.next();
		String zimu2 = "";

		for (int i = 0; i < zimu1.length(); i++) {
			if (Character.isDigit(zimu1.charAt(i)) == false)
				break;
			else {
				zimu2 += zimu1.charAt(i) + " ";
				if (i == zimu1.length() - 1)
					System.out.println("获取的5位数字验证码：" + zimu2);
			}
		}
		Scanner zifu = new Scanner(System.in);
		String zifu1 = zifu.next();
		String zifu2 = "";

		for (int i = 0; i < zifu1.length(); i++) {
			if (Character.isLetter(zifu1.charAt(i)) == false)
				break;
			else {
				zifu2 += zifu1.charAt(i) + " ";
				if (i == zifu1.length() - 1)
					System.out.println("获取的5位字符验证码：" + zifu2);
			}
		}
		Scanner hanzi = new Scanner(System.in);
		String hanzi1 = hanzi.next();
		String hanzi2 = "";

		for (int i = 0; i < hanzi1.length(); i++) {
			if (Character.isSpaceChar(hanzi1.charAt(i)) == false) {
				hanzi2 += hanzi1.charAt(i) + " ";
				if (i == hanzi1.length() - 1)
					System.out.println("获取的5位汉字验证码：" + hanzi2);
			}
		}
		Scanner hunhe = new Scanner(System.in);
		String hunhe1 = hunhe.next();
		String hunhe2 = "";

		for (int i = 0; i < hunhe1.length(); i++) {
			if (Character.isLetter(hunhe1.charAt(i)) == false)
				break;
			else {
				hunhe2 += hunhe1.charAt(i) + " ";
				if (i == hunhe1.length() - 1)
					System.out.println("获取的5位混合验证码：" + hunhe2);
			}
		}
		zimu.close();
		zifu.close();
		hanzi.close();
		hunhe.close();
	}

}
