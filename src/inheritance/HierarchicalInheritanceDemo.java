package inheritance;

class Shape {
	void draw() {
		System.out.println("Drawing shape");
	}
}

class Circle extends Shape {
}

class Rectangle extends Shape {
}

public class HierarchicalInheritanceDemo {
	public static void main(String[] args) {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		c.draw();
		r.draw();
	}
}
