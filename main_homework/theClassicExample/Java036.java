package theClassicExample;

public class Java036 {
	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int m = 7;
		int[] N = new int[n.length];
		for (int i =n.length-m; i < n.length; i++) {
			N[i-(n.length-m)] = n[i];
		}
		for (int i = 0; i < n.length - m; i++) {
			N[i+m] = n[i];
		}
		
		for (int i = 0; i < n.length; i++)
			System.out.print(N[i]+",");
	}
}