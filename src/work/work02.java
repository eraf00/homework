package work;
import java.util.Scanner;
public class work02 {
	public static void main(String[] srgs) {

		Scanner input=new Scanner(System.in);
		System.out.println("���������");
		float score= input.nextInt()/10;
		input.close();
		switch((int)score)
		{
		case 9:System.out.println("һ������ķ���,��ð���.");break;
		case 8:System.out.println("һ����Ϊ���õķ���,���Ͱ�.");break;
		case 7:System.out.println("һ����Ϊ���ķ������ټӰѾ���");break;
		case 6:System.out.println("һ���ոռ���ķ���������Ŭ����");break;
        default:System.out.println("������һ�����ߡ�");
		}
	}}	
