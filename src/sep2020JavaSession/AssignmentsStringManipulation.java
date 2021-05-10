package sep2020JavaSession;

public class AssignmentsStringManipulation {

	public static void main(String[] args) {

//	1	Write a program to check two different strings equality.

		final String Collection = "interface";
		final String Collections = "class";

		if (Collection.contains("interface") && Collections.contains("class")) {

			System.out.println("\n" + " they are not equal to each other" + " \n Collection interface provides"
					+ " the methods that can be used for data structure" + " \n Collections class provides the static"
					+ " methods which can be used for different operation");
		}

		else if (Collection == Collections || Collection.equals(Collections)) {
			System.out.println("they both same");
		}

		else {
			System.out.println("wrong info");
		}
		System.out.println("\n----------------------------------------------------------------------------");

//	2	 Remove all spaces in a String .
//		 For example : “ Hello Everyone “ . Expected result: “HelloEveryone”.

		String ar = "   We Can Store Only The Fixed Size Of Elements In Ihe Array   ";
		System.out.println(ar.trim().replace(" ", ""));

//	3	 Write a program that will print out the last character and first character
//		 of a word.
		String s = "Handle DropDown using select Class in selenium by NaveeN";

		char characterFirst = s.charAt(0);
		char characterLast = s.charAt(s.length() - 1);
		System.out.println(
				"\n first and last charcter of String sentence is: " + characterFirst + " and  " + characterLast);

		// calling methods into main
		firstLastCharacter();
		wordContains();
		reverse("\n Kharabakh is Azerbaijan");
		reversing("\n winter is next to the door ");
		halfString("Ambition is a dream with a V8 engine <Elvis Presley>");
		thirdE();
		method();
		breakString();
		middleString();
		middle();
		findNum();

	}

	//  4    Write a program that will print out last and first char of each word
	public static char[] firstLastCharacter() {

		String str = "set of words that is complete in itself ";
		char c[] = str.toCharArray();
		System.out.println("\n The first and last character of each word of: " + str);
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] != ' ' && (i == 0 || c[i - 1] == ' ' || c[i + 1] == ' ')) {
				System.out.println("\n " + c[i]);

			}

		}
		return c;

	}

//	  5 Write a program to verify a word or a character contained in the sentence.

	public static void wordContains() {

		String word = "Abraham Lincoln was an American statesman and lawyer "
				+ "who served as the 16th president of the United States from 1861 to 1865";

		if (word.contains("z")) {
			System.out.println("exact result");
		} else {
			System.out.println(" not found -----  please check code .... ");
		}
	}

//	 6.Write a function/ method to reverse your own name.

	public static void reverse(String stb) {
		System.out.println("\n given String: " + stb);
		String rev = "";

		char c[] = stb.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			rev = rev + stb.charAt(i);
		}
		System.out.println(rev);

	}

	public static void reversing(String stb) {
		System.out.println("\n given String: " + stb);
		String rev = "";

		for (int i = stb.length() - 1; i >= 0; i--) {
			rev = rev + stb.charAt(i);
		}
		System.out.println(rev);

	}

//	7 Write a program that gives you the last half of the string.
	public static void halfString(String str2) {
		int len = str2.length() / 2;
		String halftext1 = str2.substring(0, len);
		String halftext2 = str2.substring(len);

		System.out.println("first half of the string: " + halftext1);
		System.out.println("last half of the string: " + halftext2);

	}

//   8  Write a program to get the 3rd “ e “ of the string . For example: “Welcome
//  	 to Naveen Automation Labs ! “.

	public static void thirdE() {
		String str3 = "Welcome to Naveen Automation Labs ! ";
		System.out.println(str3.indexOf("e", str3.indexOf("v") + 1));
		System.out.println(
				str3.charAt(str3.indexOf("Nav") + 3) + " -> confirmation of location of 3rd occurance of character ");
//          why nav+3 bacause nav itself in 0 location  n=0, a=1, v=2, e=3

	}

//   8  Write a method which gives an index of (-1) if string is not available. .
//	 it should return integer. if String is present, then it should return the
//	 specific index.

	public static int method() {

		String str4 = "Imperfection is beauty, madness is genius and it's better "
				+ "to be absolutely ridiculous than absolutely boring.<Marilyn Monroe>";
		int index = str4.indexOf("Marilyn Monroe");

		if (index == -1) {
			System.out.println("not found 404 bad request");
		}

		else
			System.out.println("found index " + index);

		return index;

	}

//	9 Write a program that breaks a whole string into small strings, and prints
//	 out its all values . (Hint: split, loop) .

	public static void breakString() {

		String ElonMusk_Children = " 9 X Æ A-Xii, Nevada Alexander Musk, Kai Musk, Saxon Musk, Xavier Musk, Damian Musk, Griffin Musk";

		String[] splitchildren = ElonMusk_Children.split(",");

		for (String split : splitchildren)
			System.out.println(split);

	}

// 10 middle char 
	public static void middleString() {

		String John_F_Kennedy = "Brooklyn";

		int position;
		int len;

		if (John_F_Kennedy.length() % 2 == 1) {
			position = John_F_Kennedy.length() / 2;
			len = 1;
		} else {
			position = John_F_Kennedy.length() / 2 - 1;
			len = 2;
		}

		String result = John_F_Kennedy.substring(position, position + len);
		System.out.println("middle: " + result);

	}

// 11	 Assume that a string consists of 3 words, print out the middle one.
	public static void middle() {
		String s = "Jeyhun, Naveen, Farah";

		if (s.contains("Naveen")) {
			System.out.println("correct Naveen is Middle word....");
		}

		else {
			System.out.println("not found");
		}

	}
	
	
	
//	12  get only numeric part from this String: String s = "your transaction id
//    is: 12345 and reference id is 34567"
	
	public static void findNum() {
	
	
	String s = "your transaction id is: 12345 and reference id is 34567";
			
			String T_id = s.substring(s.indexOf("is:")+4, s.indexOf(" and"));
	         System.out.println("transaction_id: " +T_id );
	         String R_id = s.substring(s.indexOf("is ")+3);
	         System.out.println("reference_id " +R_id);
	}
	
	
	
	
	
	
	
	
	

}
