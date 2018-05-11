package theClassicExample;

public class Java022 {
	public static void main(String[] srg) {
		System.out.print(fac(5));
		
		
		
		
		
	}

	private static int fac(int fn) {
		if (fn==1)
		return 1;
		else 
			return fn=fn*fac(fn-1);
	}
}
