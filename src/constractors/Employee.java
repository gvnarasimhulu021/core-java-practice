package constractors;

public class Employee {
	int id;
	String name;

	Employee() {
		System.out.println("Default Constructor");
	}

	Employee(int id) {
		this.id = id;
	}

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		new Employee();
		new Employee(1);
		new Employee(2, "Narsi");
	}
}
