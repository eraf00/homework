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

		System.out.print("������" + this.name + "\n�Ա�" + this.sex + "\n���䣺" + this.age + "\n���˵Ĺ����ǣ�");
	}
}