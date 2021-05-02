package javaCodingChallenge;

public class ReverseWords {

	public static void main(String[] args) {
		
		reverse_words_in_Sentence();
		
	}
	
public static void reverse_words_in_Sentence() {
		
		String str = "Java is my favorite programming language";
		String s [] = str.split(" ");
		for(int i=0; i<s.length; i++) {
			System.err.print(s[i]+ " ");
		}
		System.out.println("");
		for(int i=s.length-1; i>=0; i--) {
			System.err.print(s[i]+ " ");
		}
		
	}
	

}
