package java20180507;

import java.util.Scanner;

//��ת���
public class InversionOutput {

	static void main(String[] srgs) {
		Scanner input = new Scanner(System.in);
		System.out.println("����һ����������");
		int score = input.nextInt();
		String score1 = input.nextLine();
		int s = score1.length();
		int right = 1;
		input.close();
		for (; s > 1; s--) {
			right *= 10;//ȨΪλ����һ
		}
		int rightmax=right;
		int i[] = new int[s + 1];
		i[0] = 0;
		for (int z = 1 ; z <= s; z++) {// c.length;//Ȩ
			i[z] = score / right - i[z - 1]*10;//�����λ��ȡ��ֵ
			right/=10;//Ȩ�ݼ�
		}
		int sum=0;
		right=rightmax;
		for (int z = s; z > 1; z--) {
			sum+=i[z]*right;
			right/=10;//Ȩ�ݼ�
		}

		System.out.println(sum);
	}
}