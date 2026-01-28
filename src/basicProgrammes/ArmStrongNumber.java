package basicProgrammes;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int n = 9474;
		int num = n, c = 0, sum = 0;
		while (n > 0) {
			c++;
			n /= 10;
		}
		n = num;
		while (n > 0) {
			int r = n % 10;
			int temp = 1;
			for (int i = 1; i <= c; i++) {
				temp *= r;
			}
			sum += temp;
			n /= 10;
		}
		if (num == sum)
			System.out.println("ArmStrong Number");
		else
			System.out.println("Not A ArmStrong Number");
	}

}
