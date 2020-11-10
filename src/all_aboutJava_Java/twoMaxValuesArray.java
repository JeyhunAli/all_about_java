package all_aboutJava_Java;

import java.util.Arrays;

public class twoMaxValuesArray {
	
	public static void getMaxTwoValuesFromArray(int []numbers) {
		
		
		
		int firstMax =0;
		int secondMax =0;
		for(int i=0; i<numbers.length; i++) {
			if(firstMax<numbers[i]) {
				
				firstMax=secondMax;
				secondMax=numbers[i];
			}
			else if
			(secondMax<numbers[i]) {
				secondMax=firstMax;
				
			}
			
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println(firstMax);
		System.out.println(secondMax);
		
	}
	
	

	public static void main(String[] args) {
		int list [] = {78, 98 ,114, 9, -767, 44, 9,500, 700, 1000, -900};
		
		getMaxTwoValuesFromArray(list);
		
		
		
	}

}
