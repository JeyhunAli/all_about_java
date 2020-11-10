package sep2020JavaSession;

public class patterntwoNumbers {

	public static void main(String[] args) {

//		Question 1: Write a program to print the following pattern using for loop:
//			  
//			  00 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
//			  26 27 28 29 30 31 32 33 34 35 36 37 38 39

		int arr[] = new int[11];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		arr[9] = 10;
//		arr[10] = 11;
//		arr[11] = 12;
//		arr[12] = 13;
//		arr[13] = 14;
//		arr[14] = 15;
//		arr[15] = 16;
//		arr[16] = 17;
//		arr[17] = 18;
//		arr[18] = 19;
//		arr[19] = 20;
//		arr[21] = 21;
//		arr[22] = 22;
//		arr[23] = 23;
//		arr[24] = 24;
//		arr[25] = 25;
//		arr[26] = 26;
//		arr[27] = 27;
//		arr[28] = 28;
//		arr[29] = 29;
//		arr[30] = 30;
//		arr[31] = 31;
//		arr[32] = 32;
//		arr[33] = 33;
//		arr[34] = 34;
//		arr[35] = 35;
//		arr[36] = 36;
//		arr[37] = 37;
//		arr[38] = 38;
//		arr[39] = 39;

		for (int i = 0; i <arr.length; i++) {
			for (int p = 0; p <arr.length; p++) {

				System.out.print(i+"" + p+" ");

			}
			System.out.println();
		}

	}

}
