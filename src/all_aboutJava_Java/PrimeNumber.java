package all_aboutJava_Java;

/**
 * 
 * @author jey
 * prime number is: number itself and one when multiple its the prime number 
 * for example when multiple 5*1=5,  you can't multiple 2*3, orany other number 
 * 10 is not prime number because 10*1=10 and also 2*5=10 
 * 
 * lowest prime num is 2
 *
 */

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("is 10 prime number ? --->> " +isPrime(10));
		System.out.println("is 27 prime number ? --->> " +isPrime(27));
		System.out.println("is 99 prime number ? --->> " +isPrime(99));
		System.out.println("is 101 prime number ? --->> " +isPrime(101));
		System.out.println("is 103 prime number ? --->> " +isPrime(103));

		
		
	
	}

	public static boolean isPrime(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for(int i=2; i<num; i++) {
			
			if(num % i == 0) {
				return false;
			}
			
		}
		return true;
		
	}
}
