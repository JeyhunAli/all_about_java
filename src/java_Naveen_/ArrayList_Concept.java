package java_Naveen_;

import java.util.ArrayList;

/**
 * 
 * @author jey
 * 
 * default class 
 * arraylist one of the famous collection in java 
 *      public class ArrayList<E> extends AbstractList<E>implements List<E>
 *      
 *      java collections is used when data is dynamic 
 * java collections are framework that provides to store and manipulate the group of the data 
 * java collections can achieve all the operations that i we can perform in java such as inserting deleting searching sorting 
 * java collections provides many interfaces like set list queue 
 * and classes Arraylist, linkedlist, Hashset, linkedhashset
 * 
 * arraylist is store the values on the base of indexing
 * once we delete or remove any arraylist value from array when we print size of it 
 * actual size will shift to ne next one because of the dynamic array concept arralist is shifting its value 
 * 
 * 
 * default capacity of arraylist when we creating object of array is ? its 10   0-9
 * but this is virtual capacity 
 * if i will print size of the arraylist right after creating object of arraylist 
 * the result will be 0 because its vc is 10 
 * 
 * in arraylist we can store dublicate values, null values, blank values its allowed in arraylist
 * 
 *      
 *
 */

public class ArrayList_Concept {

	public static void main(String[] args) {

		//default class in Jdk
		//dynamic in nature
		//can store diff types of values (raw types)
		//can provide generics also (only one type of values)
		
		ArrayList ar = new ArrayList(); //10
		
		System.out.println(ar.size());
		
		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size());
		
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size());

		ar.add(500);//4
		ar.add(600);//5
		ar.add(600);
		ar.add(null);
		
		System.out.println(ar.get(ar.lastIndexOf(null)));
		
		ar.add(12.33);
		ar.add("Selenium");
		ar.add('a');
		ar.add(true);
		
		System.out.println(ar.size());

		System.out.println(ar.get(0));
		System.out.println(ar.get(5));
		//System.out.println(ar.get(-1));//IndexOutOfBoundsException

//		ar.remove(4);
//		
//		System.out.println(ar.get(4));
//		System.out.println(ar.size());
		
		//to print all the values from arraylist:
		for(int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
		
		//data types (Generics) based ArrayList:
		
		ArrayList<String> stundentList = new ArrayList<String>();
		stundentList.add("sheba");//0
		stundentList.add("Hari");//1
		stundentList.add("Hari");//2
		
		System.out.println(stundentList.get(2));
		System.out.println(stundentList.size());


		ArrayList<Integer> stundentMarks = new ArrayList<Integer>();
		stundentMarks.add(100);
		stundentMarks.add(200);
		
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Tom");
		empData.add(25);
		empData.add(12.33);
		empData.add(true);
		empData.add('m');

		
	}

}