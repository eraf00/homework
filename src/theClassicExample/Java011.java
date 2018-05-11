package javajdsf;

public class Java011 {
	public static void main(String[] args) {
		int z = 0;
		int[] x = new int[20];
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (j != i) {
					for (int k = 1; k <= 4; k++) {
						if (k != i || k != j) {
							{
								z++;
								x[z] = i * 100 + j * 10 + k;
							}
						}
					}
				}
			}
		}
		System.out.println("能组成" + z + "个互不相同且无重复数字的三位数,都是： ");
		for (int i = 1; i < z; i++) {
			System.out.print(x[i]);
		}
	}
}
