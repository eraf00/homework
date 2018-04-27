package work;
import java.util.Scanner;

public class work01 {
	public static void main(String[] srgs) {
		for(;;) {
		Scanner input=new Scanner(System.in);
		System.out.println("输入年份！");
		input.close();
		float score=input.nextInt();
		if(score%100==0&score%400==0){
				System.out.println((int)score +"年是闰年");
		}else{
			if(score%100!=0&score%4==0){System.out.println((int)score +"年是闰年");
			}else{
				System.out.println((int)score +"年不是闰年");
				}
		
			}
		/*if((score%100==0&score%400==0)&&score%100!=0&score%4==0()){
		*		System.out.println((int)score +"年是闰年");
		*}else{
		*	
		*		System.out.println((int)score +"年不是闰年");}
		 * 
		 * 
		 * 
		*/
}
	}}	
