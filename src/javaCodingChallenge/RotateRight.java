package javaCodingChallenge;

import java.util.Arrays;

public class RotateRight {    
	 public static void main(String[] args) {    
	        //Initialize array     
	        int [] arr = new int [] {1, 2, 3, 4, 5};  
	        
	        //n determine the number of times an array should be rotated.    
	        int n = 3;    
	           
	        //Displays original array    
	        System.out.println("Original array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");     
	        }      
	            
	        //Rotate the given array by n times toward right    
	        for(int i = 0; i < n; i++){    
	           
	           
	            //Stores the last element of array    
	            int last = arr[arr.length-1];    
	            
	            for(int j = arr.length-1; j > 0; j--){    
	                //Shift element of array by one    
	                arr[j] = arr[j-1];    
	            }    
	            //Last element of array will be added to the start of array.    
	            arr[0] = last;    
	        }    
	        
	        System.out.println();    
	            
	        //Displays resulting array after rotation    
	        System.out.println("Array after right rotation: ");    
	        for(int i = 0; i< arr.length; i++){    
	            System.out.print(arr[i] + " ");    
	        }  
	        
	        System.out.println("\n----------------");
	        shiftArray(4);
	        System.out.println("\n----------------");
	        shiftArray2(2);
	    } 
	 
	 
	 public static void shiftArray(int n) {
		 
		 
		 int [] arr = new int [] {1, 2, 3, 4, 5};  
		 System.out.println("Original array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");     
	        }  
		 
		 System.out.println(Arrays.toString(arr));
	         
	        for(int i = 0; i < n; i++){    
               int last = arr[arr.length-1];    
	            
	            for(int j = arr.length-1; j > 0; j--){  
	            	arr[j] = arr[j-1];    
	            }
	            arr[0] = last;    
	        }
	        System.out.println();
	        //Displays resulting array after rotation    
	        System.out.println("Array after right rotation: ");    
	        for(int i = 0; i< arr.length; i++){    
	            System.out.print(arr[i] + " "); 
	        System.out.println(Arrays.toString(arr));
	 }
	        
}       
	        
	       
	 
	 
public static void shiftArray2(int num) {
	 
	 
	 int [] arr = new int [] {1, 2, 3, 4, 5};                         //declaring array with given numbers 
	 System.out.println("Original array: ");                          //printing original array
	 System.out.println(Arrays.toString(arr));                        //converting to string array so that i can print in proper way
        
       for(int i = 0; i < num; i++){                                    //starting forLoop with given number so that i can rotate it 
          int last = arr[arr.length-1];                                //minus one helps us to make last array included 
           
           for(int j = arr.length-1; j > 0; j--){                     
           	arr[j] = arr[j-1];    
           }
           arr[0] = last;    
       }
       System.out.println();
       //Displays resulting array after rotation    
       System.out.println("Array after right rotation: ");    
       System.out.println(Arrays.toString(arr));
}
       
	 
	 
	        
	}    

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 