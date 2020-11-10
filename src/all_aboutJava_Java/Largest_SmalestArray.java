package all_aboutJava_Java;

import java.util.Arrays;

public class Largest_SmalestArray {

	public static void main(String[] args) {


		
		
		int [] numbers = {8,9,0,12,45,67,77,44,3344,343,453,-5,-567,99,-99};
		
		int max = numbers[0];
		int min = numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i]>max) {
				max=numbers[i];
				
			}
			else if(numbers[i]<min) {
				min=numbers[i];
			}
		}
		
		System.out.println("given numbers: " +Arrays.toString(numbers));
		System.out.println("largest array: " +max);
		System.out.println("smallest array: " +min);
		
		
		
		
		
		
		
		
	
	
	
	
	}

}
