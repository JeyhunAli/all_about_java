package javaCodingChallenge;

import java.util.ArrayList;

public class printReverseWords {

	public static void main(String[] args) {

		reverse_words_in_Sentence();
		System.out.println("");
		reverseWords();
		System.out.println();
		input();

	}

	public static void reverse_words_in_Sentence() {

		String str = "Java is my favorite programming language";
		String s[] = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println("");
		for (int i = s.length - 1; i >= 0; i--) {
			System.out.print(s[i] + " ");
		}

	}

	public static void reverseWords() {
		String s = "Azerbaycan ana dogma veten";
		String split[] = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i] + " ");
		}
		System.out.println("");

		for (int i = split.length - 1; i >= 0; i--) {
			System.out.print(split[i] + " ");
		}
	}
	
	public static void input() {
		String s = "AAGGHHTTYYGGDDDFFFRRY";
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i=0; i<s.length(); i++) {
			int count = 1;
			if(!list.contains(s.charAt(i))) {
				list.add(s.charAt(i));
				for(int j=i+1; j<s.length(); j++) {
					if(s.charAt(i)==s.charAt(j)) {
						count ++;
					}
					
			}
			System.out.print(s.charAt(i) + "" + count);
			}
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
