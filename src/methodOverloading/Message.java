package methodOverloading;

public class Message {

	void print(String msg) {
		System.out.println("Message: " + msg);
	}

	void print(String msg, int count) {
		for (int i = 1; i <= count; i++) {
			System.out.println(i + " : " + msg);
		}
	}

	public static void main(String[] args) {
		Message m = new Message();
		m.print("Hello Java");
		m.print("Hello Java", 3);
	}
}
