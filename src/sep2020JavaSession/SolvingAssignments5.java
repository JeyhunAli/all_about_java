package sep2020JavaSession;

public class SolvingAssignments5 {

	public static void main(String[] args) {
		
		
		/**
		 * Write a Java program to compute the specified expressions and print the
		 * output. Go to the editor Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
		 * Expected Output 2.138888888888889
		 */
		  
		
		computeNumbers3(25.5, 3.5, 3.5, 3.5, 40.5, 4.5);
		
		

	}
	
	public static void computeNumbers3(double num1, double num2, double num3, double num4, double num5, double num6) {
		
		System.out.println(((num1 * num2 - num3 * num4) / (num5 - num6)));
		
	}

}
