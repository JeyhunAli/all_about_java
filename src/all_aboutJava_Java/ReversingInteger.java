package all_aboutJava_Java;

public class ReversingInteger {

	public static void main(String[] args) {



		int numbers = 123456789;

		int rev = 0;

		while (numbers !=0) {

			rev = rev*10+numbers%10;

			numbers = numbers / 10;

		}

		System.out.println("reversed integer numbers are " + rev );

	}









}