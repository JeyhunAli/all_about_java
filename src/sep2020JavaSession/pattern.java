package sep2020JavaSession;

/**
 * 
 * 
 * @author jey
 * 
 *         how to print on the console n = 4 n = 3 n = 2 n = 1 n = 0 using
 *         static array
 *
 */
public class pattern {

	public static void main(String[] args) {
		
		
		int [] num = {0,1,2,3,4};
		
		num[0] = 0;
		num[1] = 1;
		num[2] = 2;
		num[3] = 3;
		num[4] = 4;
		
		for(int i=num.length-1; i>=0; i--) {
			
			System.out.println("n = " +num[i]);
		}

		

	}

}
