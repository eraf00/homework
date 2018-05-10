package java20180510;

public class Students {
	String student;// teacher;
	String name;
	int age;
	String course;
	String interest;//professional;

	public void studentshow() {
		System.out.println("姓名：" + name);
		System.out.println("年龄：" + age);
		System.out.println("参加的课程：" + course);
		System.out.println("兴趣：" + interest);
	}

	public void teachershow() {
		System.out.println("姓名：" + name);
		System.out.println("专业方向：" + interest);
		System.out.println("教授的课程：" + course);
		System.out.println("教龄：" + age);
	}
}
