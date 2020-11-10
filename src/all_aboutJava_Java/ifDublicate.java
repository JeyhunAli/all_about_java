package all_aboutJava_Java;

public class ifDublicate {
	
	// check if given String contains any dublicate charcters
	
	public static void main(String[] args) {
		
		checkDublicate("check if given String contains any dublicate charcters");
		//here calling method into main method 
		
	}
	public static void checkDublicate(String sentence) {
		
		System.out.println("given String is: "+ sentence);
		
		String charcters = "";
		String dublicate = "";
		
		for(int i=0; i<sentence.length(); i++) {
			String currentChar = Character.toString(sentence.charAt(i));
			//here charcter is class which is able to convert String to char and store it 
			
			if(charcters.contains(currentChar)) {
				
				if(!dublicate.contains(currentChar)) {
					// means if dublicate not contains currentchar
					dublicate +=currentChar + " , ";
				}
			}
			charcters+=currentChar;
			
		}
		System.out.println("dublicate charcters are: "+ dublicate);
	}
	
}
