package javaoop1;

public class Car {
	String color;
	String model;

	Car() {
		this.color = "��ɫ";
		this.model = "�ͺ�";
	}

	Car(String color, String model) {
		this.color = color;
		this.model = model;
	}

	// ------------------------
	void showColor() {

		System.out.println("������ɫ��" + color);
	}

	void showModel() {

		System.out.println("�������ͣ�" + model);
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
