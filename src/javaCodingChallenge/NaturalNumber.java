package javaCodingChallenge;

public class NaturalNumber {

	public static void main(String[] args) {
		
		naturalN(100, 0);
		/**
		 * The natural numbers are the numbers that include all the positive integers 
		 * from 1 to infinity. For example, 1, 2, 3, 4, 5, ......, n. When we add these
		 *  numbers together, we get the sum of natural numbers.
		 */
		
		
		int num = 100;
		int sum = 0;
		
		for (int i=0; i<=num; i++) {
			sum=sum+i;
			
		}
		System.out.println(sum);

	}
	
	
	public static void naturalN(int num1, int sum1) {
		
		
		for (int i=0; i<=num1; i++) {
			sum1=sum1+i;
			
		}
		System.out.println(sum1);
		
	}


}
