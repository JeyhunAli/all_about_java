package java_Naveen_;

public class String_Reversing {

	public static void main(String[] args) {

		String s = "Belarusiya";
		
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			rev = rev+s.charAt(i);
			
		}
		System.out.println(rev);
	
		
		
		
	}

}
