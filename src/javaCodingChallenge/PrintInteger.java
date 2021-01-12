package javaCodingChallenge;

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("plz enter a number:");

		int num = reader.nextInt();

		System.out.println("plz enter another number: ");
                                                                         //if you dont put a bracket it will add
		                                                                  // like string (string manupliation)
		System.out.println("The answer is: " + (num + reader.nextInt()));
	}

}
