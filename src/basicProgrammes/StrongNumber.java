package basicProgrammes;

public class StrongNumber {

	public static void main(String[] args) {
		int n = 145;
		int m = n;
		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			int fact = 1;
			for (int i = 1; i <= r; i++) {
				fact *= i;
			}
			sum += fact;
			n /= 10;
		}
		if (sum == m)
			System.out.println("Strong Number");
		else
			System.out.println("NOt a Strong Number");
	}

}
