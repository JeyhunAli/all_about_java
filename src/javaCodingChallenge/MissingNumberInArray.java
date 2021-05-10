package javaCodingChallenge;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int [] numbers = {1, 2, 3, 4, 5, 6, 8};
		
		int sum1 = 0;
		for(int i=0; i<numbers.length; i++) {
			sum1 +=numbers[i];
		}
		System.out.println("summ of elements " + sum1);
		
		
		int sum2 =0;
		
		for(int i=1; i<=numbers.length+1; i++) {
			sum2 =sum2 +i;
		}
		System.out.println("summ of elements " + sum2);
		
		System.out.println("missing number is "+ (+sum2-sum1));

	}

}
