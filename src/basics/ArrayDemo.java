package basics;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		int sum = 0;

		for (int i : arr) {
			sum += i;
		}

		System.out.println("Sum = " + sum);
	}
}
