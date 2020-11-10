package sep2020JavaSession;

import java.math.BigInteger;

public class factorialN {

	public static void main(String[] args) {

		// because of all the methods im calling directly

		System.out.println("first way getting factorial number-->> " + factorialnumber1(4));
		System.out.println("second way getting factorial number-->> " + factorial2(5));
		System.out.println("third way getting factorial number-->> " + factorial3(100));

		// second assignment

		System.out.println("\n");
		int marks = marks_Grade(39);
		System.out.println("mark is: " + marks);

		// third assignment
		System.out.println("\n");
		ifPrime(33);

		// fourth assignment
		System.out.println("\n");
		isEligible(17);

		// fifth assignment
		System.out.println("\n");
		evenORodd(66);
		
		// 6th assignment
		maxMin(5, 8, -44);

	}

	/**
	 * 
	 * 
	 * ******************************************************************************************************************
	 */

//	  @param num
//	  @return first way of factorial number without loop statement here
//	          multiplication happening between number and methodName num-1 but this
//	          method is not returning big nummbers lets say i pass 100 it will
//	          return 0 for big number i will create another method

//	9. Write a program to print the factorial of a number by defining a method
//	 * named 'Factorial'. Factorial of any number n is represented by n! and is
//	 * equal to 1*2*3*....*(n-1)*n. E.g.- 4! = 1*2*3*4 = 24 3! = 3*2*1 = 6 2! = 2*1
//	 * = 2 Also, 1! = 1 0! = 0

	public static long factorialnumber1(long num) {
		if (num < 0) {
			System.out.println("not a factorial number " + num);
			return num;
		} else if (num == 1) {
			return 1;
		} else {
			return num * factorialnumber1(num - 1);
		}

	}

	// second way to get factorial number with loop statement
	// but still this way also not handling with big data

	public static int factorial2(int num) {

		int factorial = 1;
		if (num < 0) {
			System.out.println(num + " negative number not a factorial ");

		} else if (num == 1) {
			System.out.println(num + " factorial is equal " + factorial);
		} else {
			for (int i = 1; i <= num; i++) {
				factorial = factorial * i;
			}
		}
		return factorial;
	}

	// third way of getting factorial number
	// this method applicable with all kind of numbers
	public static BigInteger factorial3(int num) {

		BigInteger factorial = BigInteger.ONE;

		if (num < 0) {
			System.out.println(num + " negative number not a factorial ");

		} else if (num == 1) {
			System.out.println(num + " factorial is equal " + factorial);
		} else {
			for (int i = 1; i <= num; i++) {
				factorial = factorial.multiply(BigInteger.valueOf(i));
			}

		}
		return factorial;

	}

//	8. Write a program which will ask the user to enter his/her marks (out of  100).
//     Define a method that will display grades according to the marks entered
//     as below:
//           	Marks Grade 91-100 AA 81-90 AB 71-80 BB 61-70 BC 51-60 CD 41-50 DD   <=40 Fail

	public static int marks_Grade(int marks) {

		if (marks >= 91 && marks <= 100) {
			System.out.println("grades are AA");
		}

		else if (marks >= 81 && marks <= 90) {
			System.out.println("grades are AB");
		} else if (marks >= 71 && marks <= 80) {
			System.out.println("grades are BB");
		} else if (marks >= 61 && marks <= 70) {
			System.out.println("grades are BC");
		} else if (marks >= 51 && marks <= 60) {
			System.out.println("grades are CD");
		} else if (marks >= 41 && marks <= 50) {
			System.out.println("grades are DD");
		} else if (marks <= 40) {
			System.out.println("FAILURE");
		}

		return marks;

	}

	// 7. Define a method to find out if number is prime or not. Answer
	/**
	 * 
	 * @param num
	 * @return
	 * 
	 *         A prime number is a number which is divisible by only two numbers: 1
	 *         and itself. So, if any number is divisible by any other number, it is
	 *         not a prime number.
	 */
	public static int ifPrime(int num) {

		boolean math = false;
		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				math = true;
			}
		}
		if (!math) {
			System.out.println(num + " is prime number ");
		} else {
			System.out.println(num + " not a prime number");
		}

		return num;
	}

//	6. A person is elligible to vote if his/her age is greater than or equal to
//	 * 18. Define a method to find out if he/she is elligible to vote.

	public static int isEligible(int age) {

		if (age >= 18) {
			System.out.println(age + " this age is eligible to vote");
		} else {
			System.out.println(age + " this age not eligible to vote");
		}
		return age;
	}

	// Define a program to find out whether a given number is even or odd.

	public static int evenORodd(int num) {

		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + "is odd numver ");
		}

		return num;
	}

//	Define two methods to print the maximum and the minimum number
//	respectively among three numbers entered by user.	

	public static void maxMin(int num1, int num2, int num3) {

		if (num1 > num2 && num1 > num3) {

			System.out.println(num1 + " is the greates ");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the greates ");
	}
		else {
			System.out.println(num3 + " is the greatest");
		}


	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
