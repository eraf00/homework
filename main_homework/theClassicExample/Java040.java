package theClassicExample;

public class Java040 {
	public static void main(String[] args) {
		System.out.println("ԭ��������" + taozi());
		System.out.println("��һ�����ӷ���֮��" + houzi(taozi()));
		System.out.println("�ڶ������ӷ���֮��" + houzi(houzi(taozi())));
		System.out.println("���������ӷ���֮��" + houzi(houzi(houzi(taozi()))));
		System.out.println("���ĸ����ӷ���֮��" + houzi(houzi(houzi(houzi(taozi())))));
		System.out.println("��������ӷ���֮��" + houzi(houzi(houzi(houzi(houzi(taozi()))))));
		System.out.println("����ٷ�" + houzi(houzi(houzi(houzi(houzi(houzi(taozi())))))));

	}

	static float houzi(float taozi) {
		taozi = ((taozi - 1) / 5) * 4;
		return taozi;// 3121
	}

	static float taozi() {
		float taozi = 0;
		int j = 0;
		for (; j < 1000000; j++) {
			taozi = j;
			for (int i = 0; i < 5; i++) {
				taozi = (taozi * 5) / 4 + 1;
			}
			if (taozi == (int) taozi)
				break;

		}
		return taozi;// 3121

	}
}

// (taozi-1)/5;taozi=(taozi-1)*(4/5)�����ӵ��ھ�����-1
// 5����5+1������
// �����ĺ�������-1�� �� 6=1��4