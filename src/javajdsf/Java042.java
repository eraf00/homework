package javajdsf;

public class Java042 {
	public static void main(String[] args) {
		int i[] = { 1, 2, 2, 3, 4, 5 };
		int[] sum = new int[120000];
		int j = 0;

		for (int a = 0; a <= 5; a++) {
			for (int b = 0; b <= 5; b++) {
				if (b != a)
					for (int c = 0; c <= 5; c++) {
						if (c != a && c != b && c != 4)
							for (int d = 0; d <= 5; d++) {
								if (d != a && d != b && d != c)
									for (int e = 0; e <= 5; e++) {
										if (e != a && e != b && e != c && e != d)
											for (int f = 0; f <= 5; f++) {
												if (f != a && f != b && f != c && f != d && f != e) {
													sum[j] = 100000 * i[a] + 10000 * i[b] + 1000 * i[c] + 100 * i[d]
															+ 10 * i[e] + i[f];
													boolean x = true;
													for (int z = 0; z < j; z++) {
														if (sum[j] == sum[z]) {
															x = false;
															break;
														}
													}
													if (x == true) {
														System.out.println(sum[j]);
														j++;
													}
												}
											}
									}
							}
					}
			}
		}
	}
}
