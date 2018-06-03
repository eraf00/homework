package java_util;

import java.util.ArrayList;
import java.util.List;

public class Student {
	String name;
	int age;
	double score;
	String classNum;

	Student(String name, int age, double score, String classNum) {
		this.name = name;
		this.age = age;
		this.score = score;
		this.classNum = classNum;
	}

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Tom", 18, 100, "class05"));
		list.add(new Student("Jerry", 22, 70, "class04"));
		list.add(new Student("Owen", 25, 90, "class05"));
		list.add(new Student("Jim", 30, 80, "class05"));
		list.add(new Student("Steve", 28, 66, "class06"));
		list.add(new Student("Kevin", 24, 100, "class04"));
		double s = 0, score = 0;
		for (int i = 0; i < list.size(); i++) {
			s += list.get(i).age;
		}
		System.out.print("所有学生的平均年龄:" + s / list.size() + "\n");
		List<String> class0 = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {// 输入不同班级
			if (class0.indexOf(list.get(i).classNum) == -1)
				class0.add(list.get(i).classNum);
		} // class0列表：class05,class04,class06
		int num = 0;
		for (int i = 0; i < class0.size(); i++) {// class0列表：class05,class04,class06
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).classNum == class0.get(i)) {
					score += list.get(j).score;
					num++;
				}
			}
			System.out.println(class0.get(i) + "班班级的平均分" + score / num);
			num = 0;
			score = 0;
		}
	}
}
