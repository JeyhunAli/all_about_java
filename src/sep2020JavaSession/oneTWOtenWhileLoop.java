package sep2020JavaSession;

public class oneTWOtenWhileLoop {

	public static void main(String[] args) {

//		Write a program in Java to print 1 to 10 using while loop but quit if
//		multiple of 7 is encountered

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
			if (i == 7) {
				break;
			}
		}

		helloWorld();

	}

	// 4. Write a program in Java to print "Hello World" ten times using while loop
	public static void helloWorld() {

		int k = 1;
		while (k <= 10) {
			System.out.println("Hello-World");
			k++;
		}

	}
}