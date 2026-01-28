package methodOverriding;

class Animal {
	void sound() {
		System.out.println("Animal sound");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("Dog barks");
	}
}

public class AnimalOverrideDemo {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.sound();
	}
}
