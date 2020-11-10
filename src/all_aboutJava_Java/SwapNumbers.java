package all_aboutJava_Java;

public class SwapNumbers {

	public static void main(String[] args) {


		int a= 55;
		int b = 66;
		
		System.out.println("before swapping numbers");
		System.out.println("a--->>" +a);
		System.out.println("b--->>" +b);
		
		
		int temp;
		temp = a;
		a=b;
		b=temp;
		
		
		System.out.println("after swapping numbers");
		System.out.println("a--->>" +a);
		System.out.println("b--->>" +b);
		

		
	}

}
