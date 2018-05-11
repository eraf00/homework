package work;
import java.util.Scanner;

public class Work01 {
	public static void main(String[] srgs) {

		Scanner input=new Scanner(System.in);
		System.out.println("输入年份！");
		float score=input.nextInt();
		input.close();
		if(score%100==0&&score%400==0){
				System.out.println((int)score +"年是闰年");
		}else{
			if(score%100!=0&score%4==0){System.out.println((int)score +"年是闰年");
			}else{
				System.out.println((int)score +"年不是闰年");
			}	}}}
