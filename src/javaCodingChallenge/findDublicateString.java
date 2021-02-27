package javaCodingChallenge;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class findDublicateString {

	public static void main(String[] args) {

		
		dublicateString();
		dublicateString_2();
		
		

	}
	
	
	public static void dublicateString() {
		
		String s= "hybrid framework with with a lot of configuration are are more way way better";
		
		Map<String, Integer> mapwords = new HashMap<String, Integer>();
		String[] str =  s.split(" ");
		
		for(String word: str) {
			
			if(mapwords.get(word) != null) {
				mapwords.put(word, mapwords.get(word)+1);
			}
			else {
				mapwords.put(word, 1);
			}
		}
		System.err.println(mapwords);
		
		
		
	}
	
	
	
	
      public static void dublicateString_2() {
		
		String s= "hybrid framework with with a lot of configuration are are more way way better";
	
		
	   Map<String, Integer> words = new HashMap<String, Integer>();
	      
	    String[]  arraywords = s.split(" ");
	    for(String sword : arraywords) {
	    	
	    	if(words.get(sword) !=null) {
	    		
	    		words.put(sword, words.get(sword)+1);
	    	
	    }else {
	    	words.put(sword, 1);
	    }
	    }
	    Iterator<String> iteratorwords = words.keySet().iterator();
	      while(iteratorwords.hasNext()) {
	    	 String nextword = iteratorwords.next();
	    	 if(words.get(nextword) > 1) {
	    		 System.out.println("the word " + nextword + " appeared " + words.get(nextword) + " time"); 
	    	 }
	    	 
	      }
	
	
	
	
	
	
	
	    }
      }
	


