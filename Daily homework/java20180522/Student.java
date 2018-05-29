package java20180522;

public class Student {
	private int id;
	private String name;
	private int score;

	public Student() {
	}

	public Student(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}// 学号，成绩，分数。

	public static int test() {
		// 模拟考试成绩 (随机数)
		return (int) Math.round(Math.random() * (100 - 60) + 60);
	}
//显示学生基本情况
	public void display() {
		System.out.println("学号:" + id + " 姓名:" + name + " 分数:" + score);
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
