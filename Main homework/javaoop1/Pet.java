package javaoop1;

public class Pet {
	String name;
	int age;
	boolean gender;// �Ա�1Ϊ�У�0��ΪŮ��
	boolean partner;// ��ż1Ϊ�У�0Ϊ�ޡ�

	Pet(String name, int age, boolean gender, boolean partner) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.partner = partner;
	}

	void Marry(Pet a, Pet b) {
		if (a.gender == b.gender) {
			System.out.print("����������,ͬ�Բ�������!");
		} else if (a.partner == true || b.partner == true) {
			System.out.print("����ż�߲��ܽ�顣");
		} else if ((a.gender == true && a.age >= 5 && b.age >= 4) || (a.gender == false && a.age >= 4 && b.age >= 5)) {
			System.out.print("��ϲ" + a.name + "��" + b.name + "����ˣ�");
		} else {
			System.out.print("δ�ﵽ������䣬���ܽ�飬�ٹ�����ɣ�");
			a.partner = true;
			b.partner = true;
		}
	}
}
