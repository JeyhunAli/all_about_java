package javaCodingChallenge;

public class Vowels_and_Consonants {

	public static void main(String[] args) {

		// a e i o u

		Vowels_Consonants('b');
		ifVowels_orConsonants('e');
	}
	
	

	public static void Vowels_Consonants(char ch) {

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

			System.out.println(ch + " is Vowel");

		} else {
			System.out.println(ch + " is Consonant");
		}

	}

	
	public static void ifVowels_orConsonants(char c) {
		
	switch (c) {
	case 'a':
	case 'e':		
	case 'o':		
	case 'i':
	case 'u':
		System.out.println(c + " is Vowel");
		break;

	default:
		System.out.println(c + " is Consonant");
		break;
	}
		
		
	}
	
	
}
