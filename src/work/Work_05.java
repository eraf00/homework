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
					System.out.println("��" + i + "�컨ȥ6Ԫ��߀ʣ" + money + "Ԫ");
				} else {
					money += 5;
				money -= 2.5;
			}}
		}

		System.out.println("Ҫ���^�B�m�惦" + i + "�죬���ܴ���100Ԫ��");
	}
}