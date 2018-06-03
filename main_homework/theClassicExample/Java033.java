package theClassicExample;

public class Java033 {

	public static void main(String[] args) {
		int[][] i = new int[20][20];
		for (int a = 1; a <= 10; a++) {
			for (int b = 1; b <= a; b++) {
				i[a][0] = 0;
				i[a][1] = 1;
				i[a][a] = 1;
				i[a+1][b] = i[a][b - 1] + i[a][b];
				System.out.print(i[a][b]+"  ");
			}
			System.out.println();
		}
	}
}
