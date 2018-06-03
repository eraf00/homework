package javaoop1;

public class State extends Person {
	String statename;

	State() {
		this("张三", "男", "22", "中国");
	}

	State(String name, String sex, String age, String statename) {
		super(name, sex, age);
		this.statename = statename;
	}

	void statename() {
		System.out.println(statename + "\n");
	}
}
