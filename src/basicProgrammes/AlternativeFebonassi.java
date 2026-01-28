package basicProgrammes;

import java.util.Scanner;

public class AlternativeFebonassi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter How Many Alternative number You Want");
		int n = s.nextInt();
		int a = 0, b = 1, c = 0;
		if (n == 1) {
			System.out.println(0);
			return;
		}
		System.out.print(a);
		for (int i = 3; i <= n * 2; i++) {
			c = a + b;
			if (i % 2 != 0)
				System.out.print("  " + c);
			a = b;
			b = c;
		}
	}

}
