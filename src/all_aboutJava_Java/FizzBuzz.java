package all_aboutJava_Java;

public class FizzBuzz {

	public static void main(String[] args) {


		FizzBuzzNumbers(77);
		
		
	}
	
	public static void FizzBuzzNumbers(int num) {
		
		for(int i=1; i<=num; i++) {
			
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			
			else if (i % 3 == 0) {
				System.out.println("Fizz");

			}

			else if (i % 5 == 0) {
				System.out.println("Buzz");

			}
			else {
				System.out.println(i);
			}
		}
	}

}
