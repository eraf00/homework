package javajdsf;

public class Java021 {
	public static void main(String[] srg) {
		int figure = 1, sum = 0;
		for (; figure <= 20; figure++) {// һ����ʮ����
			int i = 1, factorial = 1;
			for (; i <= figure; i++) {// ÿһ�����Ľ׳�
				factorial *= i;
			}
			sum += factorial;// �׳�֮��
		}
		System.out.println(sum);
	}

}
