package theClassicExample;

public class Java013 {

	public static void main(String[] args) {
		int i = 1;

		for (; i < 100000; i++) {
			for (int j = 1; j < 2000; j++) {
				boolean ij = false;
				boolean iz = false;
				if ((i + 100) / j == j && (i + 100) % j == 0) {
					ij = true;
				}
				for (int z = 1; z < 2000; z++) {
					if ((i + 268) / z == z && (i + 268) % z == 0) {
						iz = true;
					}
				}
				if (ij == true && iz == true) {
					System.out.println("这个数是：" + i);
				}
			}
		}
	}
}
