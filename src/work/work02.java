package work;
import java.util.Scanner;
public class work02 {
	public static void main(String[] srgs) {

		Scanner input=new Scanner(System.in);
		System.out.println("输入分数！");
		float score= input.nextInt()/10;
		input.close();
		switch((int)score)
		{
		case 9:System.out.println("一个优秀的分数,你好棒啊.");break;
		case 8:System.out.println("一个评为良好的分数,加油啊.");break;
		case 7:System.out.println("一个评为良的分数，再加把劲。");break;
		case 6:System.out.println("一个刚刚及格的分数，还需努力。");break;
        default:System.out.println("这真是一个杯具。");
		}
	}}	
