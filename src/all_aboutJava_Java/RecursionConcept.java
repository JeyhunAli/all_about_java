package all_aboutJava_Java;

public class RecursionConcept {

	public static void main(String[] args) throws InterruptedException {

		count_Down(10);
		
		
	}
	
	public static void count_Down(int n ) throws InterruptedException {
		
		if (n == 0) {
			
			System.out.println("done");
			
		}else {
			
			Thread.sleep(1000);
			System.out.println(n);
		
		n--;
		
		count_Down(n);
		
		
		
		}	
		
	}
}
