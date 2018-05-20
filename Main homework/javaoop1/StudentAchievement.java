package javaoop1;

public class StudentAchievement extends Subject_Score {
	StudentAchievement(String sub1, String sub2, String sub3, String sub4) {
		super(sub1, sub2, sub3, sub4);
	}

	StudentAchievement(int s1, int s2, int s3, int s4) {
		super(s1, s2, s3, s4);
	}

	void print() {

		System.out.println(this.getSub1() + "成绩：" + this.getS1() + "\n" + super.getSub2() + "成绩：" + super.getS2()
				+ "\n" + super.getSub3() + "成绩：" + super.getS3() + "\n" + super.getSub4() + "成绩：" + super.getS4());
	}
}