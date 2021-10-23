package javaCodingChallenge;

public class FactorialNumbers {

	public static void main(String[] args) {

		
		//Factorial of a non-negative integer, is multiplication of all integers 
		//smaller than or equal to n. excluding zero
		//For example factorial of 6 is 6*5*4*3*2*1 which is 720.
		
		//  !5 --> this is the sighn of factorial num
		//  !0 ---> factorial of zero is always one 
		
		facttorialnumer(7);
		
		int num = 3;
		int fact = 1;
		
		for (int i=1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.println("factorial of --> " + num + " is "+ fact);
		
	}
	
	public static void facttorialnumer(int num) {
		
		int fact =1;
		for(int i=1; i<=num; i++) {
			fact = fact*i;
			
		}
		System.out.println("factorial of " + num + " is "+ fact);
		
	}
	
	
	

}
