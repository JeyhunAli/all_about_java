package java_Naveen_;


public class Array_Concept {

	public static void main(String[] args) {
		
		// Array is collection of similar kind of values 
		//limitations of array:
		//1. size is fixed: static array: To overcome this problem, we use dynamic array: ArrayList - collections
		//2. can store only similar types of values: TO overcome this issues, we use Object Array -- but this is also static array
		

		//1. int array:
		int []i = new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		//i[4]=50;//ArrayIndexOutOfBoundsException
		
		System.out.println(i[0]);
		System.out.println(i[0]+i[1]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		
		
		int[] u = {12, 13, 14, 15, 16, 17, 18, 19, 20};
		System.out.println("length of array: " +u.length);
		
		for(int e = 0; e<u.length; e++) {
			
			System.out.println(u[e]); // u is array e is index od array
		
		}
		
		int[]u1 = new int[9];
		u1[0]=12;
		u1[1]=13;
		u1[2]=14;
		u1[3]=15;
		u1[4]=16;
		u1[5]=17;
		u1[6]=18;
		u1[7]=19;
		u1[8]=20;
		
		for(int e1 = 0; e1<u1.length; e1++) {
			if(u1.length==9) {
				System.out.println("correct");
			}
			else {
				System.out.println("wrong length");
			}
		}
		
		

		int len = i.length;
		System.out.println("length of array: "+ len);
		System.out.println("LI=>"+ 0);
		System.out.println("HI=>" + (len-1));
		
		//print all the values of array: use for loop:
		for(int k=0; k<=len-1; k++){
			System.out.println(i[k]);//10 20 30 40 
		}
		
		//2. double array:
		double []d = new double[2];
		d[0]=12.33;
		d[1]=23;
		/**
		 * in double and floating data type we can store integer values but 
		 * in integer we cannot store double or float
		 */
		
		
		
		
		
		System.out.println(d[0]+d[1]);
		
		//char array:
		char c[] = new char[3];
		c[0]='a';
		c[1]='b';
		c[2]='1';
		System.out.println(c[0]+c[1]);
		
		
		//String array:
		String s[] = new String[3];
		s[0]="Java";
		s[1]="Python";
		s[2]="Ruby";
		
		for(int p=0; p<s.length; p++){
			System.out.println(s[p]);
		}
		
		
		String studentNames[] = new String[4];
		
		studentNames[0]="Radha";
		studentNames[1]="Puja";
		studentNames[2]="Soorya";
		studentNames[3]="Imad";

		for(int h=0; h<studentNames.length; h++){
			if(studentNames[h].equals("Puja")){
				System.out.println("marks : " + 100);
			}
			else if(studentNames[h].equals("Radha")){
				System.out.println("marks : " + 99);
			}
		}
		
		
		//Emp details : 
		//Object Array:  
		/**
		 * in object array we can store different type of the data but its also constant it means how many value we declare 
		 * we can store only that amount not more or less 
		 * Object is the class in java 
		 * 
		 */
		Object ob[] = new Object[5];
		ob[0] = "Deepak";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = 'M';
		ob[4] = true;
		
		for(int v=0; v<ob.length; v++){
			System.out.println(ob[v]);
		}
		
		
		
		
	}

}