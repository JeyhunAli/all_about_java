package java_Naveen_;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistUserDefine {

	public static void main(String[] args) {
		
		/**
		 * this calls to store specific user define class in Arraylist
		 * after storing all this users in class then here im creating object of that class passing parameters
		 * 
		 * then creating arraylist as generic im passing object of class then to get all the values from object stored arraylist 
		 * im using itertor because here ibject is not behaving as index it not maintaine as 0,1,2,3
		 * because of that im using iteraor with while loop not for loop 
		 */

      
		ArraylistStudents as = new ArraylistStudents("Naveen", 25, 8080, "NaveenAutomationLabs");
		ArraylistStudents as1 = new ArraylistStudents("Jeyhun", 28, 8081, "Github");
		ArraylistStudents as2 = new ArraylistStudents("Turi", 24, 8082, "Turi.com");
		
		
		ArrayList <ArraylistStudents> al = new ArrayList <ArraylistStudents>();
		al.add(as);
		al.add(as1);
		al.add(as2);
		
		
		Iterator <ArraylistStudents> it = al.iterator();
		while(it.hasNext()) {
			ArraylistStudents student = it.next();
			System.out.println(student.name+": age is "+student.age+" zipcode is- "+student.zipcode+" website is "+student.website);
			
		}
		
   
   System.out.println("------------------------------------------------------------------");
   
   /**
    * this addall method in arraylist can be use to add one arraylist to another 
    * similarly i can use remove method also 
    */
   
   ArrayList <String> add = new ArrayList <String>();
   
		add.add("Emiliya");
		add.add("Nastyush");
		add.add("Nina");
		
		ArrayList <String> add1 = new ArrayList <String>();
		add1.add("Jeyhun");
		add1.add("NewYork");
		add1.add("Gulnise");
		
		add.addAll(add1);
		
		for(int i=0; i<add.size(); i++) {
			
			System.out.print(add.get(i) + " ");
		}
		
		
		
	}

}
