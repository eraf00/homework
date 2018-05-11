package javajdsf;
import java.util.Scanner;

public class Java005 {
	public static void main(String[] srgs) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ñ§Ï°³É¼¨:");
		int score = input.nextInt();
		input.close();
		System.out.println((score>=90)?"A":((score>=60)?"B":"C"));
}}
