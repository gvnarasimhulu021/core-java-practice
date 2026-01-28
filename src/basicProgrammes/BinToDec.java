package basicProgrammes;

public class BinToDec {

	public static void main(String[] args) {
		int n = 32;
		int i = 1, res = 0;
		while (n > 0) {
			int r = n % 2;
			res = res + r * i;
			i *= 10;
			n /= 2;
		}
		System.out.println(res);
	}

}
