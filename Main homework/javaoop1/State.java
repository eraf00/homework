package javaoop1;

public class State extends Person {
	String statename;

	State() {
		this("����", "��", "22", "�й�");
	}

	State(String name, String sex, String age, String statename) {
		super(name, sex, age);
		this.statename = statename;
	}

	void statename() {
		System.out.println(statename + "\n");
	}
}
