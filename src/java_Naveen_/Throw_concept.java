package java_Naveen_;

public class Throw_concept {

	/**
	 * this is the throw new exception concpet i can create my own exception and
	 * then i can surround it with try catch block
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		String browser = "IO";
		int number;

		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("launcing chrome");
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("launcing firefox");

		}
		else if (browser.equalsIgnoreCase("safari")) {
			System.out.println("launcing safari");
		}

		else if (browser.equalsIgnoreCase("opera")) {
			System.out.println("launcing opear");
		} else {
			try {
				throw new Exception("pass Jeyhun browser ))))) ");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		number = 51;

		if (number == 45) {
			System.out.println("this is the correct value ");
		} else if (number <= 50) {
			System.out.println("this is the correct value ");

		}

		else {
			try {
				throw new Exception("pass correct data exception");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
