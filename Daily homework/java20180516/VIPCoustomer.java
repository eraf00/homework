package java20180516;

public class VIPCoustomer extends Coustomer {
	private int level;

	void touSu() {
		System.out.println("服务信息：\n" + "VIP" + this.level + "级别" + super.getName() + "先生/女士正在投诉中....");
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
