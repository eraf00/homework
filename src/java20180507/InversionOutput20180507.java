package java20180507;

//��ת���
import java.util.Scanner;

public class InversionOutput20180507 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����һ����������"); // 123456
		int score = input.nextInt();
		int rightwei = 1;
		int score1 = score;
		int rightweimax = rightwei;// ���Ȩλ6
		int right = 1;
		input.close();
		while (true) {
			score /= 10;
			if (score == 0)
				break; // 6
			rightwei++;
		}
		for (; rightwei > 1; rightwei--) {
			right *= 10;
		}
		score = score1;
		int rightmax = right;// ���Ȩ
		rightwei = rightweimax;
		int i[] = new int[rightwei];// ����һ������0~s
		for (int extract = 0; extract < rightwei; extract++) {// λ��
			i[extract] = score / right;// �����λ��ʼ��ȡ��ֵ
			score -= i[extract] * right;
			right /= 10;// Ȩ�ݼ�score1=scorescore1=score
		}
		int sum = 0;// �������ֵ
		right = rightmax;// Ȩ�������ֵ
		for (int output = rightwei - 1; output >= 0; output--) {// ���ѭ��
			sum += i[output] * right;// ���һλ�����Ȩ
			right /= 10;// Ȩ�ݼ�
		}
		System.out.println(sum);// ���

	}
}
