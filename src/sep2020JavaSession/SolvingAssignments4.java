package sep2020JavaSession;

public class SolvingAssignments4 {

	public static void main(String[] args) {
		
		/**
		 * Write a Java program to print the result of the following operations.
	 * Change your test data accordingly. Test Data:
	 * a. -5 + 8 * 6 
	 * b. (55+9) % 9 
	 * c. 20 + -3*5 / 8 
	 * d. 5 + 15 / 3 * 2 - 8 % 3 Expected Output : 43 1 19 13
	 * 
	 */
	
		solvingNumber1(5, 8, 6);
		solvingNumber2(55, 9, 9);
		solvingNumber3(20, -3, 5, 8);
		solvingNumber4(5, 15, 3, 2, 8, 3);
		
	}
	
	public static void solvingNumber1(long num1, long num2, long num3) {
		System.out.println(-num1+(num2*num3));
		}
	public static void solvingNumber2(long num1, long num2, long num3) {
		System.out.println((num1+num2)%num3);
	    }
	public static void solvingNumber3(long num1, long num2, long num3,long num4) {
		System.out.println(num1 + (((-num2) * num3) / num4 ));
		}
	public static void solvingNumber4(long num1, long num2, long num3,long num4, long num5, long num6) {
		System.out.println(num1 + num2 / num3 * num4 - num5 % num6 );
	    }
	
}
