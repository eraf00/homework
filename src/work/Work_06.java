package work;

public class Work_06 {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		//
		while (i <= 100) {
			if (i % 2 == 0) {
				sum += i;
				System.out.println(i + ",  " + "ż����" + sum + "  ;");
			}
			i++;

		}
		i = 0;
		sum = 0;
		// ������
		do {
			if (i % 2 == 0) {
				sum += i;
				System.out.println(i + ",  " + "ż����" + sum + "  ;");
			}
			i++;

		}

		while (i <= 100);
	}
}
