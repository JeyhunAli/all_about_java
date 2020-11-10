package java_Naveen_;

public class FinalKey_Word {

	public static void main(String[] args) {

		/**
		 * final keyword is used for to provide constant value i will show it in
		 * selenium framework and to prevenet inheritance method overriding
		 * 
		 * in java any number divided by zero it will throw arichmetic exception
		 */

		int i = 10;
		i = 7;
		i = 15;

		System.out.println(i + " - why 15 because we didnt declare it as final and it takes lates value if int");

		final int days = 7;
		int totalSalary = 100;

		System.out.println("weekly payment is " + days * totalSalary);

		int a = 0;
		int a1 = 9;
		System.out.println(a / a1);

		// arichmetic exception
		// System.out.println(a1/a);

		int b = 4;
		int b1 = 9;

		System.out.println(b1 % b); // reminder is 1

		int w = 9;
		int e = 4;

		System.out.println(w / e); // answer is 2 because both numbers are pure integer;

		double d = 11 / 2;

		System.out.println(d); // answer is 2.0 not 5.5 why because both numbers are pure integer

		double d1 = 11 / 2.0;

		System.out.println(d1); // answer is 5.5 because of the number is decimal

		double d2 = (float) 11 / 2;
		System.out.println(d2); // answer is 5.5 because of the we converted added float

	}

}
