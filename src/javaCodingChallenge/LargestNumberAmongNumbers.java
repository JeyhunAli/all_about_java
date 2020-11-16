package javaCodingChallenge;

public class LargestNumberAmongNumbers {

	public static void main(String[] args) {


		
		largestNum(55, 59, 54);
		
		
	}
	
	public static void largestNum(int num1, int num2, int num3) {
		
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1 +" is greatest");
			
		}
		else if(num2 > num3) {
			System.out.println(num2 +" is the greatest");
		}
		else {
			System.out.println(num3 +" is the greatest");
		}
		
		
	}
	
	

}


