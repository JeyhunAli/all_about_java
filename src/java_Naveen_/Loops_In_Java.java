package java_Naveen_;

public class Loops_In_Java {

	public static void main(String[] args) {
		
		
		
		//1 to 10
		
		/**
		 * loops in java lets say to print someting again and again 
		 * means doing something repetadly
		 * 
		 * % operator is used to get reminder how by dividing numbers
		 * for example  4%2=0, 5%2=1 9%2=1
		 * 
		 * note: in for loop and while loop if we are not increasing or decreasing the given value it will print infinite
		 * 
		 * note: Differences between For Loop And While loop
		 * 
		 * 1 for loop we use where we have order base collection what i mean by that for example 
		 * from zero to 10  its order base we put condition there counter and increasing or decreasing the given number by order base 
		 * then we can fecth all the values or we can click on specific element for that we use for loop 
		 * list interface, array list can be example for that 
		 * 
		 * 
		 * 2 while loop is not suitable,conveniant for this type of the collection 
		 * where exactly as Automation engineer we use while loop in our framework 
		 * while loop it s very conveniant with wait statement in selenium 
		 * let see    first im initializing element 
		 * element e = button 
		 * then i put cndition here while loop (check if elment is there or not)
		 * let say it found the element the click on it then increase the counter by ++
		 * whenever there non order base collection we use while loop another example for that 
		 * like set object driver.getwindow handle
		 * in set object the indexing is not order base its like first in first out 
		 * 
		 * 
		 * 3 do while loop is 
		 * in this first condition it will always execute then it will go to part of the while then it will check the condition if condition 
		 * is satisfied it will execute if not it will it will go to the another line 
		 * 
		 * 
		 */

				//1. while loop:
				int i = 1; //initialization
				while(i<=10){ //conditional 
					System.out.println(i);//1 2 3 4 5 ... 10
					i++; //incremental/decremental
				}
				
				
				int u = 10;
				while(u>=1) {
					System.out.println(u);
					u--;
				}
				
				
				int p =1;
				while(p<=20){
					if(p % 5 == 0){
						System.out.println("Hey");
					}
					p++;
				}
				
//				while(true){
//					System.out.println("hey");
//				}
				
				//for loop:
				for(int k=1; k<=10; k++){
					System.out.println(k);//1 2 3 .......10
				}
				
//				for(; ;){
//					System.out.println("JAVA");
//				}
				
				/**
				 * this also infinite loop why because inside semi colon we dont define any condition any initialization 
				 * thats why java consider it as a default loop and it will print infinite 
				 */
				
				//even numbers:
				//2 4 6 8 10
				for(int even=2; even<=10; even=even+2){
					System.out.println(even);//0 2 4  6
				}
				
				//odd numbers:
				//1 3 5 7 9
				for(int odd=1; odd<=9; odd=odd+2){
					System.out.println(odd);//1 3
				}
				
				//do-while:
				int t = 1;
				do{
					System.out.println(t);
					t++;
				}
				while(t<=10);
				
			}

		}