package javajdsf;

public class Java010 {
	public static void main(String[] srgs) {
		double up=100;
		double down = 100;
		double sum = 0;
		for (int i = 0; i <= 10; i++) {
			up = down*(0.5);
			sum = sum + down + up;
			System.out.println("������" + sum + "��;"+ up+"�ߣ�");
			down = up;
		}
		System.out.println("������" + sum + "�ף���10��" + up+"�ߣ�");
	}
}
