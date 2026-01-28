package basicProgrammes;

public class AlternatePrimeWithinRange {

	public static void main(String[] args) {
		int a = 1, b = 100, count = 0;
		for (int i = a; i <= b; i++) {
			boolean isPrime = true;
			if (i == 1)
				continue;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0)
					isPrime = false;
			}
			if (isPrime) {
				count++;
				if (count % 2 == 0)
					System.out.println(i);
			}

		}
		System.out.println("Total Alternate Prime Number with in the Range are -->" + count / 2);

	}

}
