package javaCodingChallenge;


public class quotientANDreminder {

	public static void main(String[] args) {
		
		//quotient means --> a result obtained by dividing one quantity by another.
		
		
		
		conceptof_quotientANDreminder(4757464, 6474);
		
		
		
		int div = 20;
		int divis = 5;
		
		int quotient = div/divis;
		int reminder = div%divis;
		System.out.println(ConsoleColors.BLUE + "quotient is: " + quotient+ " reminder is: " + reminder);
		
		
	}
	
	public static void conceptof_quotientANDreminder(int a, int b) {
		
		int dividend = a;  
	    int divisor = b;
	    
	    int quotient = dividend / divisor;
	    int reminder = dividend % divisor;
	    
	    System.out.println(ConsoleColors.ORANGE + "quotient is: " + quotient + " reminder is: " + reminder);
		
		
	    
	    
	}

}
