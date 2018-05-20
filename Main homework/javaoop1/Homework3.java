package javaoop1;

public class Homework3 {

	public static void main(String[] srgs) {
		StudentAchievement student1 = new StudentAchievement("语文", "数学", "英语", "理综");
		student1.print();
		student1 = new StudentAchievement(23, 35, 56, 67);
		student1.print();
		student1.setRemark("白痴");
		System.out.println("总成绩：" + student1.getSum() + "\n" + "平均成绩：" + student1.getAverage() + "\n" + "教师评语："
				+ student1.getRemark());
	}
}