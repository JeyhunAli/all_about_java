package javaCodingChallenge;

public class StringBaseInterviewQ {

	public static void main(String[] args) {
		
		getNumberFromString();
		getNumberFromString_2();
		getNumberFromString_3();
		
	}
	
	
	public static void getNumberFromString() {
		
		  String name = "808.97jservice";
		  char[] ch = name.toCharArray();
		  int count = 0;
		  
		  for(int i=0; i<ch.length; i++) {
			  if(!Character.isLetter(name.charAt(i))) {
				  count++;
			  }
			  else {
				  break;
			  }
		  }
		String output = name.substring(0, count);
		System.out.println(output);
	}
	
	
	public static void getNumberFromString_2() {
		
		String s = "808.97jservice";
		for(char i: s.toCharArray()) {
			if(Character.isLetter(i)) {
				break;
			}
			else
				System.out.print(i);
			
		}
		System.out.println();
	}
	
	
	
	
public static void getNumberFromString_3() {
		
		String s = "808.97jAservice";
	    String str = s.replaceAll("[a-z, A-Z]", "");
	    System.out.println(str);
	
}
	
	
	
	
	
	
	
	
	
	
	
	

}
