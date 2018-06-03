package javaBasis;

import java.util.Scanner;

public class Work_03 {
	public static void main(String[] srgs) {

		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个正整数：");

		int a = 1, s = 1, i = input.nextInt();
		// 方法一
		input.close();
		for (; a <= i; a++) {
			s = s * a;
		}
		System.out.print(i + "的阶乘为：" + s);
		System.out.println(fac(i));

	}

	public static long fac(int f) {
		if (f == 1) {
			return 1;
		} else {
			return f * fac(f - 1);
		}
	}
}

/*
 * fac(i) 方法二 public static long fac (int f){ if(f==1){ return 1;} else{return
 * f=f*fac(f-1);} System.out.print(i + "的阶乘为：" + f);
 * 
 * 
 * 
 * 
 */
