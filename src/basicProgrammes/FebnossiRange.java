package basicProgrammes;

import java.util.Scanner;

public class FebnossiRange {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Lower Limit");
		int l = s.nextInt();
		System.out.println("Enter Upper Limit");
		int u = s.nextInt();
		int a = 0, b = 1, c = 0;
		if (l == 0)
			System.out.println(a + " " + b);
		for (;;) {
			c = a + b;
			if (c > u)
				break;
			if (c >= l) {
				System.out.print(" ," + c);
			}
			a = b;
			b = c;
		}
	}

}
