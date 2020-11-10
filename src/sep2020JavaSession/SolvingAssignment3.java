package sep2020JavaSession;

import java.util.Scanner;

public class SolvingAssignment3 {

	public static void main(String[] args) {

		/**
		 * Write a Java program to divide two numbers and print on the screen. Test Data
		 * : 50/3 Expected Output : 16
		 * 
		 */

		 dividingNumbers();
		 
		dividingNumbers_0(3000, 70);

	}

	public static void dividingNumbers_0(long n, int m) {

		System.out.println(n / m);
	}

	public static void dividingNumbers() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number");
		long a = scan.nextLong();

		System.out.println("enter another number");
		long b = scan.nextLong();

		System.out.println(a / b);

	}

}
