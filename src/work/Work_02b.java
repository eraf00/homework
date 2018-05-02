package work;
import java.util.Scanner;
public class Work_02b{
	public static void main(String[] srgs) {
		System.out.println("ÊäÈëĞĞÊı£¡");
		Scanner input=new Scanner(System.in);
		int a=1, b=1, i=input.nextInt(),d=i;
		input.close();
		for(a=1;a<=i;a++){
		
					for(b=0;b<i-a;b++){System.out.print(" ");}
					for(d=1;d<=2*a-1;d++){System.out.print("*");}
					System.out.println("");}
					
	}}
