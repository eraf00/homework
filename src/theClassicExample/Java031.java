package theClassicExample;

import java.util.Scanner;

public class Java031 {
	public static void main(String[] srgs) {
		int[] j=new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÊı×é:");
		for(int i=0;i<10;i++) {
			j[i]= input.nextInt();
		} 
		input.close();
		for(int i=9;i>0;i--) {
			System.out.print(j[i]+"  ");
		}
}
}