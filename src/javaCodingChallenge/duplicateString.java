package javaCodingChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicateString {

	public static void main(String[] args) {
		
		printDublicate("java");
		
	}
	
	
	public static void printDublicate(String str) {
		
		if(str==null) {
			System.out.println("null string");
		}
		if(str.isEmpty()) {
			System.out.println("empty string");
		}
		if(str.length()==1) {
			System.out.println("single char string");
		}
		
		char[] words = str.toCharArray();
		Map<Character, Integer> charactermap = new HashMap<Character, Integer>();
		for(Character ch: words) {
			if(charactermap.containsKey(ch)) {
				charactermap.put(ch, charactermap.get(ch)+1);
			}
			else 
				charactermap.put(ch, 1);
		}
		
		Set<Map.Entry<Character, Integer>>  entrysett = charactermap.entrySet();
		for(Map.Entry<Character, Integer> entry : entrysett) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+ " : " + entry.getValue() + " times");
			}
		}
		
	}

}
