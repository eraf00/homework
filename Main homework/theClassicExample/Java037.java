package theClassicExample;

import java.util.Scanner;

public class Java037 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		boolean[] arr = new boolean[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true;// �±�ΪTRUEʱ˵������Ȧ��
		}
		int leftCount = n;
		int countNum = 0;
		int index = 0;
		while (leftCount > 1) {
			if (arr[index] == true) {// ����Ȧ��ʱ
				countNum++; // �����ݼ�
				if (countNum == 3) {// ����3ʱ
					countNum = 0;// ���㿪ʼ��������
					arr[index] = false;// �����˳�Ȧ��
					leftCount--;// ʣ��������һ
				}
			}
			index++;// ÿ��һ�������±��һ
			if (index == n) {// ��ѭ�����������±����nʱ��˵���Ѿ�����һȦ��
				index = 0;// ���±���Ϊ�����¿�ʼ��
			}
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] == true) {
				System.out.println(i);

			}
		}
	}
}