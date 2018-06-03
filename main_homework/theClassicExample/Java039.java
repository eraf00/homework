package theClassicExample;

import java.util.Scanner;

public class Java039 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ÊäÈë×Ö·û:");
		String inputs = input.nextLine();
		input.close();
		System.out.println(inputs);// ´òÓ¡Õâ´®×Ö·û
		char[] z = inputs.toCharArray();
		for (int i = 0; i < inputs.length(); i++) {
			for (int j = 1; j < inputs.length() - i; j++) {
				if (z[j] < z[j - 1]) {
					char temp;
					temp = z[j];
					z[j] = z[j - 1];
					z[j - 1] = temp;
				}
			}
		}
		System.out.print(z);
	}
}