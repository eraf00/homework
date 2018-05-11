package theClassicExample;

public class Java016 {
	public static void main(String[] srgs) {
		int i = 1, j = 1;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "   ");
			}
			System.out.println("  ");
		}
	}
}