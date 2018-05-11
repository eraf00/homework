package javaBasis;

public class Work_01 {

	public static void main(String[] srgs) {

		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(b + "*" + a + "=" + a * b + "   ");
			}
			System.out.println("  ");
		}

	}
}

/*
 * int a=1; int b=1; 
 * while(a<=9){
 * while(b<=a){
 *  System.out.print(b+ "*" + a+"="+a*b+"   ");b++; }
 * a++; }
 * 
 */
