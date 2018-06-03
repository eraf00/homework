package javaoop1;

public class Homework3 {

	public static void main(String[] srgs) {
		StudentAchievement student1 = new StudentAchievement("语文", "数学", "英语", "理综");
		student1.setName("白泽");
		student1 = new StudentAchievement(23, 35, 56, 67);
		student1.setRemark("白痴");
		student1.print();
		StudentAchievement student2 = new StudentAchievement("语文", "数学", "英语", "文综");
		student2 = new StudentAchievement(63, 75, 56, 67);
		student1.setName("你是猪");
		student2.setRemark("天才");
		student2.print();
	}
}