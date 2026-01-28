package basicProgrammes;

import java.util.Scanner;

public class NoOfDaysInAMonths {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Year");
		int year = s.nextInt();
		System.out.println("Enter Month");
		int m = s.nextInt();
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
			System.out.println("31 Days ");
		else if (m == 4 || m == 6 || m == 9 || m == 11)
			System.out.println("30 Days ");
		else if (m == 2) {
			if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
				System.out.println("29 Days");
			else
				System.out.println("28 Days");
		} else
			System.out.println("Invalid Inputs");
	}

}
