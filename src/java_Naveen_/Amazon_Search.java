package java_Naveen_;

public class Amazon_Search {

	// Method Overloading also calls ----->>> (compile Time Poly+Morphism):

	// within the same class:

	// 1. same method name
	// 2. different types of params / different numbers of params
	// 3. sequence of params

	// main method can be overloaded but main() signature should not be changed for
	// JVM
	// static methods can be overloaded

	public void search() { // 0 param
		System.out.println("0 param search");
	}

	public void search(String name) { // 1 param
		System.out.println("1 param search " + name);

	}

	public void search(int price) { // 1 param
		System.out.println("1 param search " + price);

	}

	public void search(String name, int price) { // 2 params
		System.out.println("2 params search " + name + " " + price);

	}

	public void search(int price, String name) { // same 2 params but sequence different is allowed
		System.out.println("2 params search " + name + " " + price);

	}

	public static void main(String[] args) {

		/**
		 * to access all the method above we are creating object of the class if the
		 * methods would be as ststic no need to create object we can call them directly
		 * 
		 * OTP stands for 'One Time Password'. OTP testing is an innovation testing
		 * technique or testing approach. These days OTP is widely used for the security
		 * purpose in all applications so that genuine user can only have the access.
		 * 
		 * 
		 */

		Amazon_Search am = new Amazon_Search();
		am.search();
		am.search(1000);
		am.search("Nike");
		am.search("Macbook", 1000);

	}

}
