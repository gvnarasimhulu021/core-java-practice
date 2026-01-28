package methodOverloading;

public class Demo {

	void show(int a, String b) {
		System.out.println(a + " " + b);
	}

	void show(String b, int a) {
		System.out.println(b + " " + a);
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.show(10, "Java");
		d.show("Java", 10);
	}
}
