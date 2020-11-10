package sep2020JavaSession;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	/**
	 * 
	 * fizzbuzz assignment with arraylist
	 */

	public static void main(String[] args) {
		List<String> listOffizzbuzz = fizzbuzz(27);
		System.out.println(listOffizzbuzz);
	}

	public static List<String> fizzbuzz(int num) {

		// creating object of arraylist by reffering List interface
		// top casting

		List<String> numbers = new ArrayList<String>();

		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				numbers.add("FizzBuzz");

			} else if (i % 3 == 0) {
				numbers.add("Fizz");

			} else if (i % 5 == 0) {

				numbers.add("Buzz");
			} else {
				numbers.add(Integer.toString(i));
			}

		}
		return numbers;
	}
}

// thanks for watching 