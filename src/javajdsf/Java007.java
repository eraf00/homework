package javajdsf;

import java.util.Scanner;

public class Java007 {
	
		  public static void main(String[] args)
		  {Scanner input = new Scanner(System.in);
			System.out.println("���������");
			Scanner length=input;
		    int len = args.length;  //��������в����ĸ���
		    if (len > 0)  //�ж��Ƿ��������в���
		    {
		      //����У�������һ��ӡ������̨
		      System.out.println(len + "�������в������������£�");
		      for (int i = 0; i < args.length; i++)
		      {
		        System.out.println(args[i]);
		      }
		    }
		    else
		    {
		      //���������ʾ��Ϣ
		      System.out.println("��û�д����κ������в�����");
		    }
		  }
		}
