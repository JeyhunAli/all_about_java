package javaCodingChallenge;

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("plz enter a number:");
		
		int num = reader.nextInt();
		//System.out.println("u entered a number: "+ num);
		System.out.println("plz add another num then hit enter " +num);
		System.out.println("the anwer is: " + (num + reader.nextInt()));

		
	}

}
