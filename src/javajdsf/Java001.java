package javajdsf;

public class Java001 {

	public static void main(String[] args) {
		int[] i = new int[10];
		i[0] = 1;
		i[1] = 1;
		System.out.print(i[0] + ", ");
		System.out.print(i[1] + ", ");
		for (int a = 0; a < 7; a++) {
			i[a + 2] = i[a + 1] + i[a];
			System.out.print(i[a + 2] + ", ");
		}
	}
}