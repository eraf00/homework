package javaoop1;

public class Homework1 {
	public static void main(String[] args) {
		CarHonda a1 = new CarHonda();
		System.out.println("��һ��������ϸ��Ϣ���£�\n�������ң�" + a1.getProduce());
		a1.showColor();
		a1.showModel();
		CarHonda a2 = new CarHonda("����ɫ");
		System.out.println("\n�ڶ���������ϸ��Ϣ���£�\n�������ң�" + a2.getProduce());
		a2.showColor();
		a2.showModel();

		CarHonda a3 = new CarHonda("��ɫ", "����", "���һ��");

		System.out.println("\n������������ϸ��Ϣ���£�\n�������ң�" + a3.getProduce());
		a3.showColor();
		a3.showModel();
	}
}