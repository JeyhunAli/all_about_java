package java_Naveen_;

public class Immmmutable_String {

	public static void main(String[] args) {

		
		/**
		 * why string is immutable if you debug your code them mouse hover on each and every string varibale refernce name 
		 * you will notice that all three string have same id it means for three in java heap have one memory object 
		 * its because of the security purpose so later nobody can change the value of string 
		 * 
		 * now mouse over after debuging to the eclipse ref val you will see the id is changed 
		 */

		String s = "selenium";
		String s1 = "selenium";
		
		String s3 = "selenium";
		
		String s4 = "eclipse";
		
		
		
		
		System.out.println(s +" " +s1+ " " + s3);
		
		System.out.println(s4);
		
		
		
	
		
	}

}
