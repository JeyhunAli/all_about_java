package sep2020JavaSession;

public class SolvingAssignments8 {

	public static void main(String[] args) {

		//Write a Java program to test a number is positive or negative.
		//Test Data Input number: 35 -- positive number Input number: -11 -- negative number
		
		
		Positive_NegativeNumbers(35);
		Positive_NegativeNumbers(-11);
		Positive_NegativeNumbers(0);
	}
	
	public static void Positive_NegativeNumbers(int numbers){
		
	
		
		if(numbers == 0) {
			System.out.println("number is " + 0);
		}
		else if(numbers > 0) {
			System.out.println("number is p0sitive");
		}
		
		else {
			System.out.println("number is negative ");
		}
		
		
	}

}

