package javaoop1;

public class Homework3 {

	public static void main(String[] srgs) {
		StudentAchievement student1 = new StudentAchievement("����", "��ѧ", "Ӣ��", "����");
		student1.setName("����");
		student1 = new StudentAchievement(23, 35, 56, 67);
		student1.setRemark("�׳�");
		student1.print();
		StudentAchievement student2 = new StudentAchievement("����", "��ѧ", "Ӣ��", "����");
		student2 = new StudentAchievement(63, 75, 56, 67);
		student1.setName("������");
		student2.setRemark("���");
		student2.print();
	}
}