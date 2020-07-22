package all_aboutJava_Java;


/**
 * 
 * 
 * @author jeyhun 
 * 
 * reversing given String Hello America 
 *
 */

public class ReverseString {
	
	
	public static void main(String[] args) {
		
		String r = reverse("reversing given String Hello America");
		System.out.println(r);
		
	}
	
	
	public static String  reverse(String s) {
		System.out.println(s);
		
		char[] letters = new char [s.length()];
		
		int indexOfLetters = 0;
		for(int i=s.length()-1; i>=0; i--) {
			letters [indexOfLetters] = s.charAt(i);
			indexOfLetters++;
			
			
			
		}
		String reverse = "";
		for (int i=0; i<s.length(); i++) {
			reverse = reverse + letters[i];
			
			
			
		}
		
		
		return reverse;
		
	}
	
}
	

