package java20180522;

import java.util.Scanner;

public class StudentManager {
  private Student[] students;

  public StudentManager(int length) {
    this.students = new Student[length];
  }

  public void add() {
    @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);//从键盘输入
    for (int i = 0; i < students.length; i++) {//循环输入
      System.out.println("学生学号:");
      int id = scanner.nextInt();
      System.out.println("学生名字:");
      String name = scanner.next();

      // 创建一个新学生
      Student student = new Student();
      student.setId(id);
      student.setName(name);
      student.setScore(Student.test()); //设置基本属性

      // 甯﹀弬鐨勬瀯閫犳柟娉�
      //Student student = new Student(id, name, Student.test());

      students[i] = student; //把这个学生储存在“某个对象”中。
    }
  }

  public void find() {
    for (int i = 0; i < students.length; i++) {
      Student student = students[i]; //输出这些属性
      student.display();
    }
  }

  public void remove() {

  }

  public void find(int id) {

  }
}
