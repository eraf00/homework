package javaoop1;

public class CarHonda extends Car {
	private String produce;

	CarHonda() {
		this("黑色");
	}

	CarHonda(String color) {
		super(color, "轿车");
		this.produce = "广州本田";
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
