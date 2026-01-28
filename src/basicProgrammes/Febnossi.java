package basicProgrammes;

import java.util.Scanner;

public class Febnossi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter How Many Febossi Numbers You Want ");
		int n = s.nextInt();
		int a = 0, b = 1, c = 0;
		if (n == 1)
			System.out.println(0);
		System.out.print(a + " , " + b);
		for (int i = 3; i <= n; i++) {
			c = a + b;
			System.out.print(", " + c);
			a = b;
			b = c;
		}
	}

}

