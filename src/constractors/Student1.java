package constractors;

public class Student1 {
	int id;
	String name;

	Student1() {
		id = 101;
		name = "Narsi";
	}

	public static void main(String[] args) {
		Student1 s = new Student1();
		System.out.println(s.id);
		System.out.println(s.name);
	}
}
