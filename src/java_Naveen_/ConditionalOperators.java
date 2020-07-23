package java_Naveen_;


public class ConditionalOperators {

	public static void main(String[] args) {

		
		int a = 30;
		int b = 20;
		
		if(b>a){
			System.out.println("b is greater");
		}
		else{
			System.out.println("a is greater");
		}
		
		System.out.println(a>b);
		
		int x = 300;
		int y = 400;
		
		if(x==y){
			System.out.println("both are equal");
		}
		else{
			System.out.println("both are not equal");
		}
		
		// > >= < <= == !=
		
		if(x >= y){
			System.out.println("hiii");
		}
		
		else{
			System.out.println("bye");
		}
		
		
		
		/**
		 * this example of the dead code 
		 * 
		 * inside bracket after if statement we always write comparison like boolean 
		 * 
		 * Short-circuiting using AND(&&) operator.
		 * 
		 * && and operator is also known as Short-circuiting operator
		 * 
		 */
		if(false){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		
		
		//WAP to find out the highest number out of three numbers:
		int d = 700;
		int e = 600;
		int f = 300;
		
		if(d>e && d>f){//true && true
			System.out.println("d is the greatest");
		}
		else if(e>f){//true
			System.out.println("e is the greatest");
		}
		else{
			System.out.println("f is the greatest");
		}
		
		
		String studentName = "Jeyhun";
		int marks = 100;
		if(studentName.equals("Jeyhun")){
			if(marks==100){
				System.out.println("Excellent");
			}
		}
		
		
		
		
	}

}