package javaoop1;

public class Homework2 {

	public static void main(String[] srgs) {
		State a1 = new State();
		System.out.print("显示第一个人的基本信息：");
		a1.showMessage();
		a1.statename();
		State a2 = new State("埃里森", "男", "41", "美国");
		System.out.print("显示第二个人的基本信息：");
		a2.showMessage();
		a2.statename();
		State a3 = new State("尹继平", "女", "26", "中国");
		System.out.print("显示第三个人的基本信息：");
		a3.showMessage();
		a3.statename();
		State a4 = new State("宋慧乔", "男", "22", "韩国");
		System.out.println("显示第四个人的基本信息：");
		a4.showMessage();
		a4.statename();
	}
}