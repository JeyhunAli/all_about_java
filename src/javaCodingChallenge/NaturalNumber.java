package javaCodingChallenge;

public class NaturalNumber {

	public static void main(String[] args) {
		
		
		/**
		 * The natural numbers are the numbers that include all the positive integers 
		 * from 1 to infinity. For example, 1, 2, 3, 4, 5, ......, n. When we add these
		 *  numbers together, we get the sum of natural numbers.
		 */
		
		
		naturalNumber(100);
		naturalnum(100);
		
		
		
		int num = 100;
		int sum = 0;
		
		for (int i=0; i<=num; i++) {
			sum=sum+i;
			
		}
		System.out.println(ConsoleColors.RED_ITALIC +" hey im natural "+ sum);

	}
	
	
	public static void naturalNumber(int num) {
		int sum = 0;
		
		for(int i=0; i<=num; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
	
		
	}
	
	public static void naturalnum(int num) {
		
		int k=0;
		int sum=0;
		while (k<=num) {
			sum=sum+k;
			k++;
		}
		System.out.println(sum);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
