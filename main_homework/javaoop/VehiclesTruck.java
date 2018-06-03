package javaoop;

public class VehiclesTruck extends Vehicles{
	float load;// дижи

	void showTruck() {
		System.out.println("\n" + getBrand() + "\n" + getColor() + "\n" +load);
	}
}
