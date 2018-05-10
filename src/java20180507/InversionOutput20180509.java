package java20180507;

//反转输出
import java.util.Scanner;

public class InversionOutput20180509 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个正整数："); // 123456
		int score = input.nextInt();
		int s=0;
		input.close();
		while(score>0) {
			s=s*10+score%10;     //s=6  score=12345 s=5 s=4 s=3
			score/=10;
			/*s=6,score=12345
			 * s=60+5;
			 * s=650+4;
			 * */
		}
		System.out.println(s);// 输出

	}
}
