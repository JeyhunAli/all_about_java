package sep2020JavaSession;

public class patterntwoNumbers2 {

	public static void main(String[] args) {
		
//		Question 1: Write a program to print the following pattern using for loop:
//		   00 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
//		  26 27 28 29 30 31 32 33 34 35 36 37 38 39
		
		int num1[] = new int[4];
		
		num1[0] = 1;
		num1[1] = 2;
		num1[2] = 3;
		num1[3] = 4;
		
		int num2 [] = new int[10];
		
		num2[0] = 1;
		num2[1] = 2;
		num2[2] = 3;
		num2[3] = 4;
		num2[4] = 5;
		num2[5] = 6;
		num2[6] = 7;
		num2[7] = 8;
		num2[8] = 9;
		num2[9] = 10;
		
		
		for (int i = 0; i <num1.length; i++) {
			for (int p = 0; p <num2.length; p++) {

				System.out.print(i+"" + p+" ");

			}
			System.out.println();
		}
		
	}

}
