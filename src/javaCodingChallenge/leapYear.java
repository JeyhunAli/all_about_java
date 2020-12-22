package javaCodingChallenge;

/**
 * 
 * @author jey
 * 
 *         Finding a year is a leap or not is a bit tricky. We generally assume
 *         that if a year number is evenly divisible by 4 is a leap year. But it
 *         is not the only case. A year is a leap year if −
 * 
 *         1. It is evenly divisible by 100 
 *         2. If it is divisible by 100, then it should also be divisible by 400 
 *         3. Except this, all other years evenly divisible by 
 *         4 are leap years.
 * 
 *         Algorithm 1. Take integer variable year 2. Assign a value to the
 *         variable 3. Check if the year is divisible by 4 but not 100, DISPLAY
 *         "leap year" 4. Check if the year is divisible by 400, DISPLAY "leap
 *         year" 5. Otherwise, DISPLAY "not leap year"
 *
 */

public class leapYear {

	public static void main(String[] args) {

		leapyear_1(1988);
		leapyear_2(1958);
		leapyear_2(1962);
		leapyear_2(1989);
	}

	public static void leapyear_1(int year) {

		if (year % 4 == 0) {
			System.out.println(ConsoleColors.RED_BOLD + year + " - Specified year is a leap year");
		} else if (year % 100 != 0) {
			System.out.println(ConsoleColors.RED_BOLD + year + " Specified year is not a leap year");
		} else if (year % 400 == 0) {
			System.out.println(ConsoleColors.RED_BOLD + year + " - Specified year is a leap year");

		}

	}
	
	

	public static void leapyear_2(int year) {

		if (year % 4 == 0  && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + " - Specified year is a leap year");
		}
		else {
			System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT + year + " - Specified year is not a leap year");
	}

}
}
