package javaCodingChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice {

	//wap to find out character more than one in String
	
	
	public static void main(String[] args) {
		
		
		printRepetetiveChar("java");

	}
	
	public static void printRepetetiveChar(String str) {
		
		if(str==null) {
			System.out.println("null string");
		}
		if(str.isEmpty()) {
			System.out.println("empty String");
		}
		if(str.length()==1) {
			System.out.println("single character");
		}
		
		char[] words = str.toCharArray();
		Map<Character, Integer> mapCharacter = new HashMap<Character, Integer>();
		
		for(Character ch: words) {
			if(mapCharacter.containsKey(ch)) {
				mapCharacter.put(ch, mapCharacter.get(ch)+1);
			}
			else {
				mapCharacter.put(ch, 1);
			}
		}
		
		//print
		Set<Map.Entry<Character, Integer>> entryset = mapCharacter.entrySet();
		for(Entry<Character, Integer> entry: entryset ) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + ":"+ entry.getValue());
			}
		}
		
	}
	
	

}
