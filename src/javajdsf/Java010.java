package javajdsf;

public class Java010 {
	public static void main(String[] srgs) {
		double up=100;
		double down = 100;
		double sum = 0;
		for (int i = 0; i <= 10; i++) {
			up = down*(0.5);
			sum = sum + down + up;
			System.out.println("共经过" + sum + "米;"+ up+"高！");
			down = up;
		}
		System.out.println("共经过" + sum + "米；第10次" + up+"高！");
	}
}
