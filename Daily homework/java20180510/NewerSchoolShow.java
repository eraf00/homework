package java20180510;

public class NewerSchoolShow {
	public static void main(String[] args) {

		NewerSchool wuyi = new NewerSchool();
		wuyi.name = "��һ�㳡";
		wuyi.classroom = 123;
		wuyi.computerroom = 345;
		wuyi.show();
		NewerSchool wuyi2 = new NewerSchool();
		wuyi2.name = "��һ�㳡";
		wuyi2.classroom = 223;
		wuyi2.computerroom = 445;
		wuyi.show();

	}
}