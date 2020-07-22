package all_aboutJava_Java;

public class ifDublicate {

	public static void main(String[] args) {

		String senteces = "check if given string contains dublicate charchters?";
		System.out.println(senteces);
		
		String charachters = "";
		String dublicates = "";
		
		for(int i=0; i<senteces.length(); i++) {
			
			//char current = senteces.charAt(i);
			
			String current = Character.toString(senteces.charAt(i));
			if(charachters.contains(current)) {
				
				if( ! dublicates.contains(current)) {
					dublicates += current + " , ";
					
					
				}
			
			}
			
			charachters += current;
			
		}
		
		System.out.println(dublicates);
		
	}
	
}

