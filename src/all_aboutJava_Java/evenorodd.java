package all_aboutJava_Java;

import java.util.Scanner;

public class evenorodd {

	public static void main(String[] args) {

		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("plz enter your Number: ");
		
	int num	= reader.nextInt();
	
	if(num %2 == 0) {
		
		System.out.println(num +"-->is even");
	}
	else {
		System.out.println(num +"--->is od");

	}
		
	}

}
