package javaCodingChallenge;

import java.util.Arrays;

public class ShiftZeroToRight {

	public static void main(String[] args) {

		int [] i = new int [] {-5,0,0,8,6,4,0,7,0,0,7,0,-1};
		System.out.println(Arrays.toString(shiftZeroToRight(i)));
		
		
		
		i = new int [] {5,0,0,8,6,4,0,7,0,0,7,0,1};
		//System.out.println(Arrays.toString(shiftZeroToRight(i)));
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
		
		
	}
	
	
	public static int[] shiftZeroToRight(int [] a) {
		
		if(a.length == 1) {
			return a;
		}
		
	    int newArray[] = new int[a.length];
		int count = 0;
		for(int numbers: a) {
			if(numbers != 0) {
				newArray[count] = numbers;
				count++;
			}
		}
		
		return newArray;
	}

}

