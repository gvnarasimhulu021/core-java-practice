package constractors;

public class Student3 {
	int id;
	String name;

	Student3(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Student3 s = new Student3(101, "Java");
		s.display();
	}
}
