package javaoop;

//定义一个人类（Person）
public class PersonTest {

	public static void main(String[] args) {
		Person man1 = new Person();
		man1.setName("白泽");
		man1.setAge(18);
		man1.display();
		Person man2 = new Person();
		man2.setName("白曦");
		man2.setAge(500);
		man2.display();
	}

}
