package java_Naveen_;

public class Assignment_forl_oop {

	public static void main(String[] args) {


		/**
		 * here im using inner and outher for loop to print exactly this format 
		 * 
		 * 
		 * 00 01 02 03 04 05 06 07 08 09 
		 * 
		 * 
		 * how the mechanism inner and outter for loop works 
		 * see first time int i=0 executed it stays as constant then entire 
		 * for(int a=0; a<=9; a++) {
				System.out.print(i+""+a+" ");
			}  code executing make that paatern 
		 * 
		 * 
		 */
		for(int i=0; i<=9; i++) {
			for(int a=0; a<=9; a++) {
				System.out.print(i+""+a+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
