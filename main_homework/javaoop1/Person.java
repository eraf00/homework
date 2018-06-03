package javaoop1;

public class Person {
	String name;
	String sex;
	String age;

	Person() {
		this("name", "sex", "age");
	}

	Person(String name, String sex, String age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	void showMessage() {

		System.out.print("姓名：" + this.name + "\n性别：" + this.sex + "\n年龄：" + this.age + "\n此人的国籍是：");
	}
}