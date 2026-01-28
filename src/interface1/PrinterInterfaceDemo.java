package interface1;

interface Printer {
	void print();
}

class HPPrinter implements Printer {
	public void print() {
		System.out.println("HP Printer printing");
	}
}

public class PrinterInterfaceDemo {
	public static void main(String[] args) {
		Printer p = new HPPrinter();
		p.print();
	}
}
