package methodOverriding;

class Bank {
	void interest() {
		System.out.println("Bank interest");
	}
}

class SBI extends Bank {
	void interest() {
		System.out.println("SBI interest is 6%");
	}
}

public class BankOverrideDemo {
	public static void main(String[] args) {
		Bank b = new SBI();
		b.interest();
	}
}
