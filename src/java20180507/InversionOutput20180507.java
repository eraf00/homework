package java20180507;

//反转输出
import java.util.Scanner;

public class InversionOutput20180507 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个正整数："); // 123456
		int score = input.nextInt();
		int rightwei = 1;
		int score1 = score;
		int rightweimax = rightwei;// 最高权位6
		int right = 1;
		input.close();
		while (true) {
			score /= 10;
			if (score == 0)
				break; // 6
			rightwei++;
		}
		for (; rightwei > 1; rightwei--) {
			right *= 10;
		}
		score = score1;
		int rightmax = right;// 最高权
		rightwei = rightweimax;
		int i[] = new int[rightwei];// 建立一个数组0~s
		for (int extract = 0; extract < rightwei; extract++) {// 位数
			i[extract] = score / right;// 从最高位开始提取数值
			score -= i[extract] * right;
			right /= 10;// 权递减score1=scorescore1=score
		}
		int sum = 0;// 定义输出值
		right = rightmax;// 权返回最高值
		for (int output = rightwei - 1; output >= 0; output--) {// 输出循环
			sum += i[output] * right;// 最后一位乘最高权
			right /= 10;// 权递减
		}
		System.out.println(sum);// 输出

	}
}
