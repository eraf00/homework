package java20180507;

import java.util.Scanner;

//反转输出
public class InversionOutput {

	static void main(String[] srgs) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个正整数：");
		int score = input.nextInt();
		String score1 = input.nextLine();
		int s = score1.length();
		int right = 1;
		input.close();
		for (; s > 1; s--) {
			right *= 10;//权为位数减一
		}
		int rightmax=right;
		int i[] = new int[s + 1];
		i[0] = 0;
		for (int z = 1 ; z <= s; z++) {// c.length;//权
			i[z] = score / right - i[z - 1]*10;//从最高位提取数值
			right/=10;//权递减
		}
		int sum=0;
		right=rightmax;
		for (int z = s; z > 1; z--) {
			sum+=i[z]*right;
			right/=10;//权递减
		}

		System.out.println(sum);
	}
}