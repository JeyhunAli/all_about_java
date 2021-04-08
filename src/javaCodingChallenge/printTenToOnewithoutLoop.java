package javaCodingChallenge;

public class printTenToOnewithoutLoop {

	public static void main(String[] args) {

		numbers(1);

	}

	public static void numbers(int n) {
		if (n <= 10) {
			//numbers(n + 1);    //ten to one 
			System.out.println(n);
			numbers(n + 1);    // one to ten 
			
		}
	}

}
