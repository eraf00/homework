package javajdsf;

public class Java003 {

	public static void main(String[] args) {
		int  i = 100;
		for (; i < 1000; i++) {
			 int a = i / 100, b = (i - a*100) / 10, c = i - a *100- b*10;
			if (a * a * a + b * b * b + c * c * c == i) {
				System.out.println(i );
			}
		}
	}
}
