package abstract1;

abstract class Mobile {
	abstract void call();
}

class Samsung extends Mobile {
	void call() {
		System.out.println("Samsung calling");
	}
}

public class MobileAbstractDemo {
	public static void main(String[] args) {
		Mobile m = new Samsung();
		m.call();
	}
}
