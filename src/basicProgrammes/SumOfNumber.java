package basicProgrammes;

public class SumOfNumber {

	public static void main(String[] args) {
		int n = 123654;
		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			sum += r;
			n /= 10;
		}
		System.out.println(sum);
	}

}
