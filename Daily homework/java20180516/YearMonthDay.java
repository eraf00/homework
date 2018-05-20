package java20180516;

import java.util.Scanner;

public class YearMonthDay {
	public static void main(String[] srgs) {
		int[] i=new int[3];
		System.out.println("依次输入年，月，日：");
		Scanner input = new Scanner(System.in);
		for(int j=0;j<3;j++) {
			i[j] = input.nextInt();
		}
		int year=i[0];
		int month=i[1];
		int day=i[2];
		input.close();
		System.out.println(i);
		if(year<0||month<0||month>12) {
			if(month==1||month==3||month==5 ){}
		}
	}
}
