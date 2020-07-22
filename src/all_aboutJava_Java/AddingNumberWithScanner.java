package all_aboutJava_Java;

/**
 * System.in here is pointing to the console to print over there
 */

import java.util.Scanner;

public class AddingNumberWithScanner {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
	long a = scan.nextLong();
		
		System.out.println("enter another number");
	long b = scan.nextLong();
		
		System.out.println(a+b);
		
	}

}
