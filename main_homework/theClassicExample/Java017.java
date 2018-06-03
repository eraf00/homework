package theClassicExample;

public class Java017 {
	public static void main(String[] srgs) {
		int day = 10;
		int[] peach = new int[day];
		peach[10] = 1;
		for (; day > 1; day--) {
			peach[day - 1] = (peach[day] + 1) * 2;
			if (day - 1 == 1) {
				System.out.println("第一天共摘了" + peach[day - 1]);
			}
		}
	}
}