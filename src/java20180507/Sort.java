package java20180507;
//≈≈–Ú
public class Sort {
	static void main(String[] srgs) {
		int[] i = { 1, 2, 3, 6, 5, 4, 3};

		for (int x = 0; x < 7; x++) {
			for (int c = 0; c < 7; c++) {
				int min = 0;
				if (i[c + 1] < i[c]) {
					min = i[c + 1];
					min = i[c];
					i[c] = i[c + 1];
					i[c + 1] = min;
				}
			}
		}
		for (int y = 0; y < 7; y++) {
			System.out.println(i[y]);
		}
	}
}
