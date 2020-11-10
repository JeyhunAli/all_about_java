package all_aboutJava_Java;

import java.util.Scanner;

public class CodePlusMinus {

	public static void main(String[] args) {

	
	
		Scanner reader = new Scanner(System.in);
		System.out.println("plz enter your number: ");
		
	int number = reader.nextInt();
	
	if(number % 2 == 0) {
		System.out.println(number + " even number");
	}
	else {
		System.out.println(number + " odd number");

	}
		
		
	}
	
	

}
