package javaoop;

public class VehiclesTest {

	public static void main(String[] args) {
		VehiclesCar car1=new VehiclesCar();
		car1.setColor("白色");
		car1.setBrand("苦无");
		car1.seats=5;
		car1.showCar();
		VehiclesTruck truck1=new VehiclesTruck();
		truck1.setColor("黑色");
		truck1.setBrand("无聊");
		truck1.load=12;
		truck1.showTruck();
	}
}
