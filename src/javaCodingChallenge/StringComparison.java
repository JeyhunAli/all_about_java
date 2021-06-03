package javaCodingChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StringComparison {

	/**
	 * input AAAABBCCCDDDDEEEG OUTPUT A4B2C3D4E3G1
	 * 
	 */

	public static void main(String[] args) {

		input();
		input_2();
		System.out.println();
		input_3();
		reverseString();
		reverse_words_in_Sentence();
		
		
		
		
	}

	public static void input() {
		String s = "AAAABBCCCDDDDEEEG";
		String[] sArray = s.split("");
		Map<String, Integer> map = new HashMap<>();
		for (String tempString : sArray) {
			if (map.containsKey(tempString)) {
				map.put(tempString, map.get(tempString) + 1);
			} else {
				map.put(tempString, 1);
			}
		}
		System.out.println(map.toString().replaceAll("\\W", ""));
		// A4B2C3D4E3G1
		//System.out.println("list " + map);
	}
	

	
	public static void input_2() {

		String s = "AAAABBCCCDDDDDEEEG";                // declaring string 
		ArrayList<Character> list = new ArrayList<>();  // starting char type arraylist 
		for (int i = 0; i < s.length(); i++) {          // starting for loop 
			int count = 1;                              //getting to know the count thats why declared int count
			if (!list.contains(s.charAt(i))) {          //if arraylist not contains any string char 
				list.add(s.charAt(i));                  // then add it 
				for (int j = i + 1; j < s.length(); j++) {     // starting another for loop adding new value on top of old values 
					if (s.charAt(i) == s.charAt(j)) {           // if old value equals to new one then 
						count++;                                // increase the value by one 
					}

				}
				
				System.out.print(s.charAt(i) + "-" + count+ " ");       //then print char and count 
			}

		}
	}
	
	
	public static void input_3() {
		
	String s = "AAAGGGFFFHHHTTTYYYSSSGGVFFfffF";
	 ArrayList<Character> list = new ArrayList<Character>();
	 for (int i=0; i<s.length(); i++) {
		 int count = 1;
		 if(!list.contains(s.charAt(i))) {
			 list.add(s.charAt(i));
			 for(int j=i+1; j<s.length(); j++) {
				 if(s.charAt(i)==s.charAt(j)) {
					 count++;
				 }
			 }
			 System.out.print(s.charAt(i) + "" + count);
		 }
	 }
	
	
	
	
	
	
	}
	
	public static void reverseString() {
		String s = "Selenium testing By me";
		String reverse = "";
		for(int i = s.length()-1; i>=0; i--) {
			reverse = reverse+s.charAt(i);
			
		}
		System.out.println();
		System.out.println(reverse);
	}
	
	
	public static void reverse_words_in_Sentence() {
		
	
		
		String s = "i love u so much";
		System.out.println(s);
		String split[]= s.split(" ");
		for(int i=split.length-1; i>=0; i--) {
			System.out.print(split[i] +" ");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
