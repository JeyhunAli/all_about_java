package all_aboutJava_Java;

public class CodePlusMinus {

	
	//lowest prime is 2
	
	public static void main(String[] args) {
		
		System.out.println(isPrime(24));
		
	}
	
	
	public static boolean isPrime(int num) {
		
		while (num <= 1) {
			return false ;
			
		}
		
		for(int i=2; i<num; i++) {
			
			if(num % i == 0) {
				return false;
			}
		}
		return true;
		
	}
	
}

	
		
	


	



