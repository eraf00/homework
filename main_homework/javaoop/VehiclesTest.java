package javaoop;

public class VehiclesTest {

	public static void main(String[] args) {
		VehiclesCar car1=new VehiclesCar();
		car1.setColor("��ɫ");
		car1.setBrand("����");
		car1.seats=5;
		car1.showCar();
		VehiclesTruck truck1=new VehiclesTruck();
		truck1.setColor("��ɫ");
		truck1.setBrand("����");
		truck1.load=12;
		truck1.showTruck();
	}
}
