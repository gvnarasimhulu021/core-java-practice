package constractors;

public class Student2 {
	int id;
	String name;

	Student2(int i, String n) {
		id = i;
		name = n;
	}

	public static void main(String[] args) {
		Student2 s = new Student2(102, "Java");
		System.out.println(s.id + " " + s.name);
	}
}
