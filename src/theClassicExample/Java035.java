package javajdsf;

import java.util.Scanner;

public class Java035 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ñ§Ï°³É¼¨:");
		int score = input.nextInt();
		input.close();
		int s=0;
		while(score>0) {
			s=10*s+score%10;
			score=score/10;
			
		}
		System.out.println(s);
	}
}
