package javaoop;

//交通工具(Vehicle)
public class Vehicle {

	public static void main(String[] args) {
		VehicleClass vehicle = new VehicleClass();
		vehicle.setName("汽车");
		vehicle.setSpeed(200);
		vehicle.setSize("5*3");
		vehicle.setColor("blue");
		vehicle.move();
		vehicle.speed(400);
		vehicle.speedup();
		vehicle.speeddown();
		System.out.println(vehicle.getName() + " " + vehicle.getColor() + " " + vehicle.getSpeed() + " "
				+ vehicle.getSize() + " ");
		VehicleClass c = new VehicleClass("Audi", 800, "800*23", "blue");
		c.show();
	}
}