package javaoop1;

public class Homework3 {

	public static void main(String[] srgs) {
		StudentAchievement student1 = new StudentAchievement("����", "��ѧ", "Ӣ��", "����");
		student1.print();
		student1 = new StudentAchievement(23, 35, 56, 67);
		student1.print();
		student1.setRemark("�׳�");
		System.out.println("�ܳɼ���" + student1.getSum() + "\n" + "ƽ���ɼ���" + student1.getAverage() + "\n" + "��ʦ���"
				+ student1.getRemark());
	}
}