package sep2020JavaSession;

public class StringExtractword {

	public static void main(String[] args) {

		// trying to get each word of string sentence with count of charcter

		String s = "String manipulation class from Naveen K";

		s = s + ' ';

		int start = 0;

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c == ' ') {

				String word = s.substring(start, i);
				System.out.println(word + " - " + word.length());
				start = i + 1;
				System.out.println();
			}

		}

		System.out.println("------------------------------------------------");

		String sentence = "String manipulation class from Naveen K";
		int wordCount = 0;

		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i + 1)) && (i > 0)) {
				// here i+1 means add words by one

				wordCount++;
			}

		}

		// To count the last word present in the string, increment wordCount by 1
		wordCount++;

		System.out.println("Total number of words in the given string: " + wordCount);
	}

}
