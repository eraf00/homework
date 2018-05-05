package work;

public class Work_05 {
	public static void main(String[] args) {
		int i = 0;
		float money = 0;
		while (money <= 100) {
			{
				i++;
				if (i % 5 == 0) {
					money += 5;
					money -= 2.5;
					money -= 6;
					System.out.println("第" + i + "天花去6元，還剩" + money + "元");
				} else {
					money += 5;
				money -= 2.5;
			}}
		}

		System.out.println("要經過連續存儲" + i + "天，才能存上100元！");
	}
}