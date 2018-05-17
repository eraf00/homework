package javaoop;

//交通工具(Vehicle)
public class VehicleS2Test {

	public static void main(String[] args) {
		VehicleS2 vehicle = new VehicleS2();
		vehicle.setName("汽车");
		vehicle.setSpeed(200);
		vehicle.setSize("5*3");
		vehicle.setColor("blue");
		vehicle.move();
		vehicle.speed(400);
		vehicle.speedup();
		vehicle.speeddown();
		System.out.println("\n交通工具名："+vehicle.getName() + "\n颜色： " + vehicle.getColor() + "\n速度： " + vehicle.getSpeed() + "\n尺寸： "
				+ vehicle.getSize() + " ");
		VehicleS2 c = new VehicleS2("Audi", 800, "800*23", "blue");
		c.show();
	}
}