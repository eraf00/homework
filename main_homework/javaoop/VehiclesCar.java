package javaoop;

public class VehiclesCar extends Vehicles {
	int seats;// ��λ
	void showCar() {
		System.out.println("\n" + getBrand() + "\n" + getColor() + "\n" + seats);
	}
}
