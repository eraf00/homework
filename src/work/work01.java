package work;
import java.util.Scanner;

public class work01 {
	public static void main(String[] srgs) {
		for(;;) {
		Scanner input=new Scanner(System.in);
		System.out.println("������ݣ�");
		input.close();
		float score=input.nextInt();
		if(score%100==0&score%400==0){
				System.out.println((int)score +"��������");
		}else{
			if(score%100!=0&score%4==0){System.out.println((int)score +"��������");
			}else{
				System.out.println((int)score +"�겻������");
				}
		
			}
		/*if((score%100==0&score%400==0)&&score%100!=0&score%4==0()){
		*		System.out.println((int)score +"��������");
		*}else{
		*	
		*		System.out.println((int)score +"�겻������");}
		 * 
		 * 
		 * 
		*/
}
	}}	
