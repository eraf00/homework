package java20180522;

import java.util.Scanner;

public class StudentManagerTest {
	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager(2);//两个学生

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1.鏂板瀛︾敓");
			System.out.println("2.鏄剧ず鎵�鏈夊鐢�");
			System.out.println("3.閫�鍑�");
			System.out.println("璇烽�夋嫨:[1 2 3]");
			int choose = scanner.nextInt();
			if (choose == 1) {
				studentManager.add(); //增加一个学生
			} else if (2 == choose) {
				studentManager.find(); //输出所有学生
			} else if (3 == choose) {
				// break; // 跳出循环
				System.exit(0); // 閫�鍑虹▼搴� (缁堟褰撳墠姝ｅ湪杩愯鐨� Java 铏氭嫙鏈�)
			}
			
		}
	}
}
