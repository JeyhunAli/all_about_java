package javaCodingChallenge;

public class ischarAlphabetorNot {

	public static void main(String[] args) {

		
		ischaralphabetornot('*');
		
		
		
	}
	
	public static void ischaralphabetornot (char charackter) {
		
		if( charackter >= 'a' && charackter <= 'z' || charackter >= 'A' && charackter <= 'Z') {
			
			System.out.println(charackter+ " is Alpahaphet");
			
		}
		else {
			System.out.println(charackter+ " is not Alpahaphet");
		}
		
	}

}
