package theClassicExample;

public class Java002 {
	public static void main(String[] args) {
		for (int sqrt = 101; sqrt <= 200; sqrt++) {
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
