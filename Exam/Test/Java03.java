package Test;

public class Java03 {

	public static void main(String[] args) {
		float s = 0;
		for (float i = 1; i <= 10; i++) {
			s += 1 / (i * i);
		}
		System.out.print(s);
	}
}
