package javaCodingChallenge;

public class quotientANDreminder {

	public static void main(String[] args) {
		
		//quotient means --> a result obtained by dividing one quantity by another.
		
		
		
		conceptof_quotientANDreminder(4757464, 6474);
		
		
	}
	
	public static void conceptof_quotientANDreminder(int a, int b) {
		
		int dividend = a;  
	    int divisor = b;
	    
	    int quotient = dividend / divisor;
	    int reminder = dividend % divisor;
	    
	    System.out.println("quotient is: " + quotient + " reminder is: " + reminder);
		
		
	}

}
