package javajdsf;

public class Java009 {
	public static void main(String[] srgs) {
		for (int figure = 1; figure < 1000; figure++) {// һ��1000������ѭ��
			int[] factor = new int[figure];// ����һ�����ӿ�
			int a = 0, z = 0, n = 0;
			for (int i = 1; i < figure; i++) {// ��ȡ����
				if (figure % i == 0) {
					n++;
					factor[n] = i;
				}
			}
			for (; z <= n; z++) {// ���ӿ��������ݵĳ˻�
				a += factor[z];

			}
			if (figure == a) {// �������
				System.out.print(" " + figure + ";");
			}
		}
	}
}
