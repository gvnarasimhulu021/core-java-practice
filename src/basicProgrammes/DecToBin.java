package basicProgrammes;

public class DecToBin {
	public static void main(String[] args) {
		int n = 100000, res = 0, i = 1;
		while (n > 0) {
			int r = n % 10;
			res = res + r * i;
			n /= 10;
			i *= 2;
		}
		System.out.println(res);
	}
}
