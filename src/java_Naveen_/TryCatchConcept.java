package java_Naveen_;

public class TryCatchConcept {
	/**
	 * 
	 * if there some exception it goes to that block but lets say there are no any exception it 
	 * never go inside the exception 
	 * 
	 * one single try block we can have multiple catch block
	 * 
	 * exception and there some errors also they are not same exception are common but errors not
	 * errors are ram issues or stack over flow memeory issues
	 * 
	 * catch(Exception e) ---->> catch(Throwable t) is super class of exception it handles both error and exception 
	 * and super class of Throwable is object 
	 * 
	 * diffrences between try/catch and throws exception is 
	 * try/catch is actually handling the exception but throws exception is just passing exception from one method to another
	 * 
	 */
	
	public static int a;

	public static void main(String[] args) {


		System.out.println("java");
		System.out.println("java");
		System.out.println("java");
		System.out.println("java");

		try {
		a = 9/0;
		}
		catch(Exception e) {  // exception is super class of all the exception 
			//i can write here exact exception name if i know exact one 
			System.out.println(a);
			System.out.println("some excpetion is there but because of the try catch block they are ignored");
			e.printStackTrace();  // if this line is there it means it will give you information about exception
		}
		
		
		
		System.out.println("selenium");
		System.out.println("selenium");

		
		
		
	}

}
