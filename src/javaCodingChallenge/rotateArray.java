package javaCodingChallenge;

import java.util.Arrays;

public class rotateArray {
	
	public static void main(String[] argv) {
		
		
		
//	      int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
//	      System.out.println("Initial array...\n"+Arrays.toString(arr));
//	      System.arraycopy(arr, 1, arr, 0, arr.length - 1);
//	      System.out.println("Array after shifting to the left...");
//	      System.out.println(Arrays.toString(arr));
	      
	      
	      
	      
	      
	      rightRotate1();
	      
	     
	   }
	

	
	
	public static void rightRotate1() {
		
		int [] a = {1, 2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(a));
		int size = a.length;
		int last = a[size-1];
		for(int i=size-1; i>0; i--) {
			a[i]=a[i-1];
		}
		a[0]= last;
		System.out.println(Arrays.toString(a));
	}
	
	
	
	

	

}
