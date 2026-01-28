package basicProgrammes;

import java.util.Scanner;

public class CurrecncyCounter {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Amount");
		int amt = s.nextInt();
		if (amt > 2000) {
			int count2000 = amt / 2000;
			amt = amt % 2000;
			System.out.println("2000  * " + count2000 + " = " + (2000 * count2000));
		}
		if (amt > 500) {
			int count500 = amt / 500;
			amt = amt % 500;
			System.out.println("500  * " + count500 + " = " + (500 * count500));
		}
		if (amt > 100) {
			int count100 = amt / 100;
			amt = amt % 100;
			System.out.println("100  * " + count100 + " = " + (100 * count100));
		}
	}
}
