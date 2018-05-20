package javaoop1;

public class Car {
	String color;
	String model;

	Car() {
		this.color = "红色";
		this.model = "型号";
	}

	Car(String color, String model) {
		this.color = color;
		this.model = model;
	}

	// ------------------------
	void showColor() {

		System.out.println("车的颜色：" + color);
	}

	void showModel() {

		System.out.println("车的类型：" + model);
	}
	// -----------------------------

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMadel() {
		return model;
	}

	public void setMadel(String madel) {
		this.model = madel;
	}

}
