package java_Naveen_;

public class increaseValueByTwo {
	
	

	public static void main(String[] args) {


//
//for(int i = 0; i<=10; i= i+2 ) {
//	System.out.println(i);
//	
//}
		even_snum_Increase(10);
		odd_num_Increase(10);
		
	}
	
	
	public static void even_snum_Increase(int number) {
		
		for(int i = 0; i<=number; i = i+2) {
			
			System.out.println(i);
		}
		
	}
	
	public static void odd_num_Increase(int number) {
		
		for(int i=1; i<number; i=i+2) {
			System.out.println(i);
		}
	}

}
