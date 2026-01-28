package methodOverriding;

class Vehicle {
	void run() {
		System.out.println("Vehicle running");
	}
}

class Car extends Vehicle {
	void run() {
		System.out.println("Car running fast");
	}
}

public class VehicleOverrideDemo {
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.run();
	}
}
