package basicProgrammes;

public class PolindromeOrNot {

	public static void main(String[] args) {
		int n = 123210;
		int org = n;
		int rev = 0;
		while (n > 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n /= 10;
		}
		if (rev == org)
			System.out.println("Polindrome");
		else
			System.out.println("Not A Polindrome");
	}

}
