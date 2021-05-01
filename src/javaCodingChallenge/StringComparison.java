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

		String s = "AAAABBCCCDDDDDEEEG";
		ArrayList<Character> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			if (!list.contains(s.charAt(i))) {
				list.add(s.charAt(i));
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						count++;
					}

				}
				
				System.out.print(s.charAt(i) + "" + count);
			}

		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
