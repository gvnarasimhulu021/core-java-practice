package encapsulation;

class Account {
	private double balance;

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
}

public class AccountEncapsulationDemo {
	public static void main(String[] args) {
		Account a = new Account();
		a.setBalance(50000);
		System.out.println(a.getBalance());
	}
}
