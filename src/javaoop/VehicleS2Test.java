package javaoop;

//��ͨ����(Vehicle)
public class VehicleS2Test {

	public static void main(String[] args) {
		VehicleS2 vehicle = new VehicleS2();
		vehicle.setName("����");
		vehicle.setSpeed(200);
		vehicle.setSize("5*3");
		vehicle.setColor("blue");
		vehicle.move();
		vehicle.speed(400);
		vehicle.speedup();
		vehicle.speeddown();
		System.out.println("\n��ͨ��������"+vehicle.getName() + "\n��ɫ�� " + vehicle.getColor() + "\n�ٶȣ� " + vehicle.getSpeed() + "\n�ߴ磺 "
				+ vehicle.getSize() + " ");
		VehicleS2 c = new VehicleS2("Audi", 800, "800*23", "blue");
		c.show();
	}
}