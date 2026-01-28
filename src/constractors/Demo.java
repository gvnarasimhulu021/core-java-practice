package constractors;

public class Demo {

	Demo() {
		this(10);
		System.out.println("Default Constructor");
	}

	Demo(int a) {
		System.out.println("Parameterized Constructor: " + a);
	}

	public static void main(String[] args) {
		new Demo();
	}
}
