package javaCodingChallenge;

public class ReverseString {


	public static void main(String[] args) {

		String s = "Azeribaycanimin hamimiz ovladiyig baki menim vetenim ona canla bagliyig";

		int len=s.length();

		String reverse = "";

		for (int i=len-1; i>=0; i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);


		String s1="Hello America";
		StringBuffer sf = new StringBuffer(s1);

		System.out.println(sf.reverse());




		/**
		 * 
		 *   2 way to do reverse in string 1st is for loop
		2 is string Buffer 
		 blank reverse is for storing reversed value 
		charachter at method is for taking char is available on string value 
		 reverse=reverse+s.charAt(i); -----this means reverse is equal blank and 
	    plus whatever char on string so it becomes reversed char
		 * 
		 * 
		 * 
		 * 
		 */

		//	regular expression 
		String s2="^%^&*^^%#$@$%^&^&&*Azeribaycanimin hamimiz ovladiyig baki menim vetenim ona canla bagliyig@@#@#@#@#@)()()()()()";

	s2=s2.replaceAll("[^a-zA-Z0-9]", " ");
	System.out.println(s2);

	}
}