package work;

import java.util.Scanner;
public class work_04 {
public static void main(String[] srgs) {
	System.out.println("�������:");
	Scanner input1=new Scanner(System.in);
	int di=input1.nextInt();
	System.out.println("������ݣ�");
	Scanner input2=new Scanner(System.in);
	int a=1,mi=input2.nextInt(),sum=1;
	if(mi==1) {System.out.println(di);}
	else {
			input1.close();input2.close();
			for(;a<=mi;a++) {sum=sum*di;}
			System.out.println(sum);

}}}
