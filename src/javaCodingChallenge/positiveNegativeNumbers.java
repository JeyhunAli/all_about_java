package javaCodingChallenge;

public class positiveNegativeNumbers {

	public static void main(String[] args) {

		positive_negative_numbers(77);
		
	}
	
	public static void positive_negative_numbers(double num1) {
		
		if(num1 < 0.0) {
			System.out.println(num1 + " - negative number");
		}
		
		else if(num1 > 0.0) {
			System.out.println(num1 + " - positive number");
		}
		
		else {
			System.out.println(num1 + " - is equal to zero");
		}
	}

}
