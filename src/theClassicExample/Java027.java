package theClassicExample;

public class Java027 {
	public static void main(String[] args) {
		for (int sqrt = 1; sqrt <= 100; sqrt++) {
			int n = 0;
			for (int a = 2; a < sqrt; a++) {
				if (sqrt % a == 0) 
					n++;
			}
			if (n == 0) {
				System.out.print(sqrt+ ", ");
			
		}
	}
	}
}
