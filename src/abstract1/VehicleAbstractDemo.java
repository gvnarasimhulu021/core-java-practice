package abstract1;

abstract class Vehicle {
	abstract void fuel();
}

class Bike extends Vehicle {
	void fuel() {
		System.out.println("Petrol");
	}
}

public class VehicleAbstractDemo {
	public static void main(String[] args) {
		Vehicle v = new Bike();
		v.fuel();
	}
}
