package javaoop;

public class Vehicles {
	private String brand;
	private String color;

	void run() {
	      System.out.println("我已经开动了");
	}
	void showInfo(){
		System.out.println("商标:"+brand+"\n颜色:"+color);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
