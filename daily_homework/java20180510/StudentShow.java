package java20180510;

public class StudentShow {
	public static void main(String[] args) {
		Students student1 = new Students();
		student1.name="����";
		student1.age=10;
		student1.course="�������";
		student1.interest="��Ӿ";
		student1.studentshow();
		
		System.out.println("\n");
		Students teacher1 = new Students();
		teacher1.name="����";
		teacher1.age=10;
		teacher1.course="�������";
		teacher1.interest="���";
		teacher1.teachershow();

	}
}