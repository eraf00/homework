package java20180516;

public class VIPCoustomer extends Coustomer {
	private int level;

	void touSu() {
		System.out.println("������Ϣ��\n" + "VIP" + this.level + "����" + super.getName() + "����/Ůʿ����Ͷ����....");
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
