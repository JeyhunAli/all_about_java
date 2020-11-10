package sep2020JavaSession;

import java.util.ArrayList;

public class searchElement {
	
	/**
	 * 
	 * write a java program to search an element in ArrayList 
	 */

	public static void main(String[] args) {
		
		
		ArrayList<String> colors = new ArrayList<String>();
		
		
		colors.add("white");
		colors.add("black");
		colors.add("blue");
		colors.add("pink");
		colors.add("red");
		colors.add("orange");

		//element that i want to find
		String searcElement = "white";
				
				for(int i=0; i<colors.size(); i++) {
					
					System.out.println(colors.get(i));
					
					if(searcElement==colors.get(i)) {
						
						System.out.println("\n");
						
						System.out.println("element is found with the name of: "+ searcElement);
						
						break;
					}
				}
		
		
		
	}
	
}
