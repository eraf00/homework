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
	}// ѧ�ţ��ɼ���������

	public static int test() {
		// ģ�⿼�Գɼ� (�����)
		return (int) Math.round(Math.random() * (100 - 60) + 60);
	}
//��ʾѧ���������
	public void display() {
		System.out.println("ѧ��:" + id + " ����:" + name + " ����:" + score);
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
