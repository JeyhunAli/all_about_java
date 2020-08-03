package java_Naveen_;

public class Switch_case {

	public static void main(String[] args) {


		/**
		 * always asking question 
		 * differences between if else and switch case 
		 * 
		 *  let me explain if else condition will check matching point until it will find then it will stop 
		 *  if (if) it will check all the matching and unmatching point then it will choose mathced one 
		 *  switch case its not checking all the given values right jumping to the matching point 
		 */


		String browser = "chrome";

		switch (browser) {

		case "chrome":
			System.out.println("launch Chrome");
			break;

		case "firefox":
			System.out.println("launch firefox");
			break;

		case "safari":
			System.out.println("launch safari");
			break;

		case "opera":
			System.out.println("launch opera");
			break;

		default:
			System.out.println("please pass correct browser ");
			break;
		}


		String studentNAme = "Adam";
		int marks = 99;

		if(studentNAme.equalsIgnoreCase("Jeyhun")) {
			if(marks==95) {
				System.out.println("excellent");
			}

		}
		else if(studentNAme.equalsIgnoreCase("Adam")) {
			if(marks==99) {
				System.out.println("more than excellent");
			}
		}
		else {
			System.out.println("failure");

		}


		int markss = 50;

		switch (markss) {
		case 100:
			System.out.println("Excellent");
			break;
		case 90:
			System.out.println("GRADE A");
			break;

		default:
			System.out.println("FAILURE");
			break;
		}



	}

}
