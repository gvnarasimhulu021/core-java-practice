package basicProgrammes;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter New Number");
		int n = s.nextInt();
		boolean isPrime = true;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0)
				isPrime = false;
		}
		if (isPrime)
			System.out.println(" Prime Number");
		else
			System.out.println(" Not A Prime Number ");
	}

}
