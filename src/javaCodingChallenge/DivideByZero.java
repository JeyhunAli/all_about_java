package javaCodingChallenge;

public class DivideByZero {

	public static void main(String[] args) {
		
		/**
		 * in java any integer number divide  by zero it will give you  
		 * ArithmeticException
		 * but if any of the numbers double or float
		 * it will give you infinite
		 * 
		 */
		
		System.out.println(0/0.0);   //NaN
		System.out.println(9.0/0);   //Infinity 
	//	System.out.println(10/0);    // Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println(10/0.0);
		

		
		
		

	}

}
