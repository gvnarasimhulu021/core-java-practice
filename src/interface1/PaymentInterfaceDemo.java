package interface1;

interface Payment {
	void pay();
}

class PhonePe implements Payment {
	public void pay() {
		System.out.println("Payment via PhonePe");
	}
}

public class PaymentInterfaceDemo {
	public static void main(String[] args) {
		Payment p = new PhonePe();
		p.pay();
	}
}
