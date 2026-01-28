package exceptions;

class InvalidAmountException extends Exception {
	InvalidAmountException(String msg) {
		super(msg);
	}
}

public class CustomExceptionDemo {

	static void withdraw(int amount) throws InvalidAmountException {
		if (amount < 1000) {
			throw new InvalidAmountException("Minimum amount is 1000");
		} else {
			System.out.println("Withdrawal successful");
		}
	}

	public static void main(String[] args) {
		try {
			withdraw(500);
		} catch (InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
	}
}
