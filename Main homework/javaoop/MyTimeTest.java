package javaoop;

//��ʱ����в���
public class MyTimeTest {

	public static void main(String[] args) {
		MyTime now = new MyTime(12, 30, 20);
		for (int i = 1; i < 60; i++) {

			now.display();
		}
	}
}