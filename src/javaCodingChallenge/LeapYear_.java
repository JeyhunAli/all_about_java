package javaCodingChallenge;

public class LeapYear_ {

	public static void main(String[] args) {
		

		leapYear(2020);
		
		//lets see is this year Leap year or not ))
		
	}
	
	public static void leapYear (int year) {
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			
			
			System.out.println(ConsoleColors.ORANGE + year + " Specified year is Leap Year");
		}
		
		else {
			
			
			System.out.println(ConsoleColors.DARK_BLUE + year + " Specified year is not leap year");
		}
	}

}
