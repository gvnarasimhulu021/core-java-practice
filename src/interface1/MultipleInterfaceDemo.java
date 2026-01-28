package interface1;

interface A {
	void show();
}

interface B {
	void display();
}

class Demo implements A, B {
	public void show() {
		System.out.println("Show method");
	}

	public void display() {
		System.out.println("Display method");
	}
}

public class MultipleInterfaceDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.show();
		d.display();
	}
}
