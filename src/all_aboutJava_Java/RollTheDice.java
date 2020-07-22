package all_aboutJava_Java;

import java.util.Random;

public class RollTheDice {

	public static void main(String[] args) {


		Random randam = new Random();
		int rolleddice = randam.nextInt(99);
		
		
		System.out.println("rolled dice number is " + rolleddice);
		
		
		
		
	}

}
