package javaoop;

public class Vehicles {
	private String brand;
	private String color;

	void run() {
	      System.out.println("���Ѿ�������");
	}
	void showInfo(){
		System.out.println("�̱�:"+brand+"\n��ɫ:"+color);
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
