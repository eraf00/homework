package javaoop;

public class Person {
	private String name;
	private int age;

	void display() {
		System.out.println("������"+name + "\n���䣺"+ age+"\n");
	}

	// --------------------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
