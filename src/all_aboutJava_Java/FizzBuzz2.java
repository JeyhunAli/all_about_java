package all_aboutJava_Java;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz2 {

	public static void main(String[] args) {

		List<String> list = fizzbuzz2(25);
		System.out.println("\n" + "" +"\n" +list);


	}

	public static List<String> fizzbuzz2(int num) {

		List<String> result = new ArrayList<String>();

		for (int i = 1; i <= num; i++) {

			if (i % 3 == 0 && i % 5 == 0) {

				result.add("FizzBuzz");
			} else if (i % 3 == 0) {
				result.add("Fizz");
			} else if (i % 5 == 0) {
				result.add("Buzz");
			} else {
				result.add(Integer.toString(i));
			}

		}
		return result;
	}
}
