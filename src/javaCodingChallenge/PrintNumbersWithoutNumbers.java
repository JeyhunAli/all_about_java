package javaCodingChallenge;

public class PrintNumbersWithoutNumbers {

	public static void main(String[] args) {

		int one = 'c' / 'c';
        String s = "..........";
        for (int i = one; i <= (s.length() * s.length()); i++) {
			System.out.println(i);
		}
        

		System.out.println("\n=====\n");

		
		
		for (int i = one; i <= 'd'; i += one) {
			System.out.println(i);
		}
		
		
		System.out.println("\n=====\n");


		String a = "Bone";
		String b = "Aone";
		int i = a.compareTo(b);
		int j = (i + i + i) * (i + i + i) + i;
		for (int n = i; n <= j * j; n++) {
			System.out.println(n);
		}
		
		
		
		System.out.println("\n=====\n");
		
		
		
		
		String f = "JavaScript";
		int zero = f.length() - f.length();
		int hundred = f.length() * f.length();
		for(int h = zero; h<=hundred; h++) {
			System.out.println(h);
		}

		
		
	}
	
	
	
	
}
