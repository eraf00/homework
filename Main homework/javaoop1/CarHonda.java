package javaoop1;

public class CarHonda extends Car {
	private String produce;

	CarHonda() {
		this("��ɫ");
	}

	CarHonda(String color) {
		super(color, "�γ�");
		this.produce = "���ݱ���";
	}

	CarHonda(String color, String model, String produce) {
		super(color, model);
		this.produce = produce;
	}

	// ----------------------

	public String getProduce() {
		return produce;
	}

	public void setProduce(String produce) {
		this.produce = produce;
	}
}
