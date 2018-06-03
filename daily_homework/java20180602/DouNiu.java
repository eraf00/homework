package java20180602;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DouNiu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] suit = { "����", "����", "÷��", "����" };
		String[] point = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		List<String> cards = new ArrayList<>();
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < point.length; j++) {
				cards.add(suit[i] + point[j]);
			}
		}
		cards.add("����");
		cards.add("С��");
		System.out.println("�����ƣ�"+cards.toString());//���������----------------------------
		// ϴ��
		Collections.shuffle(cards);
		System.out.println("ϴ�ƺ���ƣ�"+cards.toString());//�����������----------------------------
		Player[] ps = new Player[3];
		ps[0] = new Player(1, "�ŷ�", new ArrayList<>());
		ps[1] = new Player(2, "����", new ArrayList<>());
		ps[2] = new Player(3, "����", new ArrayList<>());

		for (int i = 0; i < 5 * ps.length; i++) {//����
			String c = cards.get(i);
			ps[i % ps.length].getCard().add(c);
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(ps[i].getName() + "���ƣ�" + ps[i].getCard());//---------------------------------
		}
		boolean youniu = false;
		for (int play = 0; play < ps.length; play++) {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (j != i)
						for (int x = 0; x < 5; x++) {
							if (x != j && x != i) {
								if ((point10(ps[play].getCard().get(i)) + point10(ps[play].getCard().get(j))
										+ point10(ps[play].getCard().get(x))) % 10 == 0) {
									System.out.println(ps[play].getName()+"\t���ʮ�����������ƣ�"+ps[play].getName() + ps[play].getCard().get(i)+ps[play].getCard().get(j)+ps[play].getCard().get(x));
									youniu = true;
									break;
								}
							}
							if (youniu)
								break;
						}
				}
				if (youniu)
					break;
			}
			int niunum = 0;
			niunum = (point10(ps[play].getCard().get(0)) + point10(ps[play].getCard().get(1))
					+ point10(ps[play].getCard().get(2)) + point10(ps[play].getCard().get(3))
					+ point10(ps[play].getCard().get(4))) % 10;

			if (youniu) {
				if(niunum==0) {System.out.println(ps[play].getName() + " - ��ţ\tţţ");}
				System.out.println(ps[play].getName() + " - ��ţ   - ţ" + niunum);
			}else
				System.out.println(ps[play].getName() + " - û��ţ");
			youniu = false;
		}

	}

	static int point10(String a) {
		String[] point = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "����", "С��" };
		int[] z = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 10 };
		int i = 0;
		for (; i < 15; i++) {
			if (a.endsWith(point[i]))
				return z[i];
		}
		return z[i];
	}
	/*
	 * static int point10(String a) { int point0 = 0; switch (a.charAt(a.length() -
	 * 1)) { case 'A': point0 = 1; break; case 2: point0 = 2; break; case 3: point0
	 * = 3; break; case 4: point0 = 4; break; case 5: point0 = 5; break; case 6:
	 * point0 = 6; break; case 7: point0 = 7; break; case 8: point0 = 8; break; case
	 * 9: point0 = 9; break; default: point0 = 10; a.charAt(a.length() - 1); }
	 * return point0; }
	 */
}