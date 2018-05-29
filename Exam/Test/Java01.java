package Test;

import java.util.Scanner;

public class Java01 {
	public static void main(String[] args) {
		int[] score = new int[10];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {

			score[i] = input.nextInt();

		}
		input.close();
		int min=100,max=0,s=100;
		for(int i = 0; i < 10; i++) {
			if(score[i]<min) min=score[i];
			if(score[i]>max) max=score[i];
			s+=score[i];
		}
		System.out.println((((float)s)-max-min)/8);
	}
}