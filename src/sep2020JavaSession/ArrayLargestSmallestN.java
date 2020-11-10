package sep2020JavaSession;

import java.util.Arrays;

public class ArrayLargestSmallestN {

	/**
	 * how to find out in array if given number is largest one or smallest one
	 */

	public static void main(String[] args) {

		
	}

	// creating separate method
	public static void largestORsmallest(int[] numbers) {

		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > largest) {
				largest = numbers[i];

			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
			
			else {
				System.out.println("pass correct data");
			}
		}
	

		System.out.println("given Array numbers are: " + Arrays.toString(numbers));
		System.out.println("largest number in array " + largest);
		System.out.println("smallest number in array " + smallest);

		// lets run it
		// let me first call method inside main method

	}
}
