package javaoop;

public class VehicleClass {
	private String name;
	private int speed;
	private String size;
	private String color;

	public VehicleClass() {
	  }

	public VehicleClass(String name,int speed,String size, String color) {
	    this.name = name;
	    this.speed = speed;
	    this.size=size;
	    this.color = color;
	  }

	public void move() {
		System.out.println(name + "移动了");
	}

	public void speed(int speed) {
		System.out.println(name + "以" + speed + "前进 ");
	}

	public void speedup() {
		System.out.println(name + "速度提升");
	}

	public void speeddown() {
		System.out.println(name + "速度下降");
	}

	public void show() {
		System.out.println(name + " " + speed + " " + size + " " + color + " " );
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
