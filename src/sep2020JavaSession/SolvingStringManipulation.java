package sep2020JavaSession;

public class SolvingStringManipulation {

	public static void main(String[] args) {

		String str = "Hello This is my first java code and I am so happy int ";
		System.out.println(str.indexOf("i"));
		// 1st occurrence of i

		System.out.println("----");
		System.out.println(str.indexOf("i", str.indexOf("i") + 1));
		// 2nd occurrence of i

		System.out.println("----");
		System.out.println(str.indexOf("i", str.indexOf("first") + 1) +" 2nd ");
		

		System.out.println("----");
		System.out.println(
				str.charAt(str.indexOf("first") + 1) + " -> confirmation of location of 3rd occurance of character ");
		// 3rd occurance
		
		
		System.out.println("----");
		System.out.println(str.indexOf("i", str.indexOf("happy") + 1) +" 4th occurance ");
		// 4th occurance

		String enroll = "Your transaction id is 12345 please enroll";
		System.out.println("----");

		// this method is used to extract exact portion of part from given sentece of
		// String
		System.out.println(enroll.substring(enroll.indexOf("1"), enroll.indexOf("5") + 1));

	}

}
