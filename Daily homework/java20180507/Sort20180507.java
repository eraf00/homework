package java20180507;
//≈≈–Ú
import java.util.Scanner;

public class Sort20180507 {// ≈≈–Ú
	public static void main(String[] srgs) {
		int[] array = new int[7];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		array = bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	private static int[] bubbleSort(int[] array) {
		for (int x = 0; x < array.length - 1; x++) {//012345
			for (int c = 0; c < array.length - x - 1; c++) {
				int max = 0;
				if (array[c + 1] < array[c]) {
					max = array[c];
					array[c] = array[c + 1];
					array[c + 1] = max;
				}
			}
		}
		// TODO Auto-generated method stub
		return array;

	}
}
