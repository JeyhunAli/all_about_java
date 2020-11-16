package javaCodingChallenge;

public class SwappingNumbers {

	public static void main(String[] args) {
	

		int a = 100;
		int b = 200;
		
		System.out.println("before swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("after swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		

	}

}
