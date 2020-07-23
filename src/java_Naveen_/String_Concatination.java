package java_Naveen_;

public class String_Concatination {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		
		double d1 = 12.33;
		double d2 = 23.33;
		
		String x = "Hello";										        								
		String y = "World";
		
		System.out.println(a+"\t"+b);
		System.out.println(a+"\n"+b);

		
		System.out.println(a+b);//300
		System.out.println(x+y);
		System.out.println(x+" "+y);
		System.out.println(a+x);
		
		//100200
		System.out.println("100"+200);
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		//why here we are getting helloworld100200    because executing happening from left to right here left helloworld adding by 100 
		// becoming helloworld100 then adding 200 then helloworld100200 
		System.out.println(x+y+(a+b));
		
		System.out.println("the value of a is : " + a);
		System.out.println("the value of b is : " + b);
		
		//"the sum of a and b is 300"
		
		System.out.println("the sum of a and b is: "+ (a+b));
		//pay close attention here as well same issue like line number 29
		System.out.println("the sum of a and b is: "+ a+b);
		
		
		System.out.println("***********");
		String e = "1";
		String c = "1";
		System.out.println(e+c);
		
		int f = 33;
		int g = 44;
		
		System.out.println(f+g);
		
		
		System.out.println("***********");

		
		System.out.println(d1+d2+a+b);
		System.out.println(d1+d2+x+y);
		
		System.out.println(a+b+x+y+d1+d2);
		
		System.out.println("Hello" + "\n" + "Selenium");
		
		System.out.print(10000+"\n");
		System.out.print(20000+"\n");
		System.out.print(30000);
		
		
	}

}
