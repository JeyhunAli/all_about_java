package sep2020JavaSession;

public class SolvingAssignments7 {

	public static void main(String[] args) {


	
//		    Take three numbers from the user and print the greatest number
//	          Test Data Input the 1st number: 25 Input the 2nd number: 78 Input the 3rd
//	         number: 87 Expected Output : The greatest: 87
	
		greatestInput();
	}
	
	
	public static void greatestInput() {
		int a = 25;
		long b = 78;
		int c = 87;
		
		if(a>b && a>c) {
			System.out.println("THe greates number : " + a);
			
		}
		else if(b>a&&b>c) {
			System.out.println("The greatest number is :"  +b);
		}
		
		else {
			System.out.println("The greatest number is :"  +c);
		}
		
	}

}
