package javaoop;

public class VehicleS2 {
	private String name;
	private int speed;
	private String size;
	private String color;

	public VehicleS2() {
	}

	public VehicleS2(String name, int speed, String size, String color) {
		this.name = name;
		this.speed = speed;
		this.size = size;
		this.color = color;
	}
	// --------------------------------------

	public void move() {
		System.out.println(name + "ÒÆ¶¯ÁË");
	}

	public void speed(int speed) {

	}

	public void speedup() {
		if (speed > 0)
			speed--;

	}

	public void speeddown() {
		if (speed < 120)
			speed++;
	}

	public void show() {
		System.out.println(name + " " + speed + " " + size + " " + color + " ");
	}
	// ---------------------------------------

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
