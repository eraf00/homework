package work;
import java.util.Scanner;

public class Work01 {
	public static void main(String[] srgs) {

		Scanner input=new Scanner(System.in);
		System.out.println("������ݣ�");
		float score=input.nextInt();
		input.close();
		if(score%100==0&&score%400==0){
				System.out.println((int)score +"��������");
		}else{
			if(score%100!=0&score%4==0){System.out.println((int)score +"��������");
			}else{
				System.out.println((int)score +"�겻������");
			}	}}}
