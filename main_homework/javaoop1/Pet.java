package javaoop1;

public class Pet {
	String name;
	int age;
	boolean gender;// 性别：1为男，0，为女。
	boolean partner;// 配偶1为有，0为无。

	Pet(String name, int age, boolean gender, boolean partner) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.partner = partner;
	}

	void Marry(Pet a, Pet b) {
		if (a.gender == b.gender) {
			System.out.print("必须是异性,同性不允许结婚!");
		} else if (a.partner == true || b.partner == true) {
			System.out.print("有配偶者不能结婚。");
		} else if ((a.gender == true && a.age >= 5 && b.age >= 4) || (a.gender == false && a.age >= 4 && b.age >= 5)) {
			System.out.print("恭喜" + a.name + "和" + b.name + "结婚了！");
		} else {
			System.out.print("未达到结婚年龄，不能结婚，再过几年吧！");
			a.partner = true;
			b.partner = true;
		}
	}
}
