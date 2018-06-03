package java20180510;

public class StudentShow {
	public static void main(String[] args) {
		Students student1 = new Students();
		student1.name="°×Ôó";
		student1.age=10;
		student1.course="±à³ÌÓïÑÔ";
		student1.interest="ÓÎÓ¾";
		student1.studentshow();
		
		System.out.println("\n");
		Students teacher1 = new Students();
		teacher1.name="°×êØ";
		teacher1.age=10;
		teacher1.course="±à³ÌÓïÑÔ";
		teacher1.interest="±à³Ì";
		teacher1.teachershow();

	}
}