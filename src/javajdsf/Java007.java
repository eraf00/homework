package javajdsf;
//无法计算空格个数
//无法实现对空格的判断啊
import java.util.Scanner;

public class Java007 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入字符:");
		String inputs = input.next();
		input.close();
		System.out.println(inputs);// 打印这串字符
		int theletter = 0;
		int space = 0;
		int digital = 0;
		int other = 0;
		if (inputs.length() > 0) {
			for (int i = 0; i < inputs.length(); i++) {
				inputs.charAt(i);
				if ((inputs.charAt(i) >= 'a' && inputs.charAt(i) <= 'z')
						|| inputs.charAt(i) >= 'A' && inputs.charAt(i) <= 'Z') {
					theletter++;
				} else if (inputs.charAt(i) == ' ') {
					space++;
				} else if (inputs.charAt(i) >= '0' && inputs.charAt(i) <= '9') {
					digital++;
				} else {
					other++;
				}

			}

			System.out.println("英文字母个数：" + theletter);
			System.out.println("空格个数：" + space);
			System.out.println("数字个数：" + digital);
			System.out.println("其它" + other);
		} else {
			System.out.println("你没有输入字符串");
		}
	}
}
