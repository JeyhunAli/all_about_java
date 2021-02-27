package javaCodingChallenge;

public class SwappingNumbers {

	public static void main(String[] args) {
	

		
		int a = 20;
		int b = 30;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println(" before swapping" + a + " " + b);
		
		
		
		int temp;
		temp = a;
		a=b;
		b=temp;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println(" after swapping" + a + " " + b);
	}

}
