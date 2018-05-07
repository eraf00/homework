package javajdsf;

public class Java019 {
	public static void main(String[] srgs) {
		int[] xing = { 1, 3, 6, 8, 6, 3, 1 };
		for (int i = 0; i < xing.length; i++) {
			for (int j = 1; j <= xing[i]; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
