package javaoop1;

public class Homework2 {

	public static void main(String[] srgs) {
		State a1 = new State();
		System.out.print("��ʾ��һ���˵Ļ�����Ϣ��");
		a1.showMessage();
		a1.statename();
		State a2 = new State("����ɭ", "��", "41", "����");
		System.out.print("��ʾ�ڶ����˵Ļ�����Ϣ��");
		a2.showMessage();
		a2.statename();
		State a3 = new State("����ƽ", "Ů", "26", "�й�");
		System.out.print("��ʾ�������˵Ļ�����Ϣ��");
		a3.showMessage();
		a3.statename();
		State a4 = new State("�λ���", "��", "22", "����");
		System.out.println("��ʾ���ĸ��˵Ļ�����Ϣ��");
		a4.showMessage();
		a4.statename();
	}
}