package javajdsf;

public class Java021 {
	public static void main(String[] srg) {
		int figure = 1, sum = 0;
		for (; figure <= 20; figure++) {// 一到二十的数
			int i = 1, factorial = 1;
			for (; i <= figure; i++) {// 每一个数的阶乘
				factorial *= i;
			}
			sum += factorial;// 阶乘之和
		}
		System.out.println(sum);
	}

}
