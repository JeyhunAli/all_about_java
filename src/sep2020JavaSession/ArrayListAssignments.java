package sep2020JavaSession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAssignments {

	public static void main(String[] args) {

//		1. Write a Java program to create a new array list, add some
//		   colors (string) and print out the collection
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("red");
		ar1.add("blue");
		ar1.add("black");
		ar1.add("white");
		ar1.add("purple");
		ar1.add("grey");
		ar1.add("green");
		ar1.add("darkblue");
		ar1.add("hotred");

		for (int i = ar1.size() - 1; i >= 0; i--) {
			System.out.print(ar1.get(i) + " ");
		}
		System.out.println("   $%&#$%@#$%<<<let me have some separator guy>>>>>>   ");

		for (int y = 0; y < ar1.size(); y++) {
			System.out.print(ar1.get(y) + " ");
		}

//			2. Write a Java program to insert an element into the array list at the first
//			   and last positions.

		System.out.println();
		System.out.println("first charcter at zero position is: " + ar1.get(0).charAt(0));
		System.out.println("before adding value to the first position-->> " + ar1);
		ar1.add(0, "yellow");
		System.out.println("after adding new value to the first position-->> " + ar1);
		System.out.println("*************");
		
		
//			3. Write a Java program to retrieve an element (at a specified index) from a
//			   given array list.

		System.out.println(ar1.get(6));

//		4. Write a Java program to update specific arraylist element by given element.

		System.out.println("\n \n ArrayList before uptading" + ar1);

		int indexOfar1 = ar1.indexOf("purple");
		ar1.set(indexOfar1, "orange");

		System.out.println("\n \n ArrayList after uptading" + ar1);

//			5. Write a Java program to remove the third element from a array list.	

		System.out.println("\n \n ArrayList before removing " + ar1.get(3));
		ar1.remove(3);
		System.out.println("\n \n ArrayList after removing " + ar1.get(3));

//			6. Write a Java program to search an element in a array list.

		String searchElement = "darkblue";
		for (int i = 0; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));
			if (searchElement == ar1.get(i)) {
				System.out.println("\n ");
				System.out.println("element is found with name of: " + searchElement);
				break;
			}
		}
//			 8. Write a Java program to extract a portion of a array list.
		System.out.println("\n \n");

		ArrayList<Object> plants = new ArrayList<Object>();

		plants.add("Aglaia");
		plants.add("Anchusa");
		plants.add("Alstonia");
		plants.add("Bellium");
		plants.add("Browningia");
		plants.add("Byrsonima");
		plants.add("Burretiokentia");
		plants.add("Chorizema");
		plants.add("Dillwynia");
		plants.add("Desmodium");
		plants.add("Eomecon (snow poppy)");
		plants.add("Glottiphyllum");
		plants.add("Isopyrum");

		System.out.println(plants.size());

		for (Object plantsList : plants) {
			System.out.println("\n " + plantsList);
		}
		System.out.println("--------------");
		plants.stream().forEach(list -> System.out.println(list));

		List<Object> sublistOFplant = plants.subList(0, 6);
		System.out.println("\n");

		System.out.println("portion of plantsList: " + sublistOFplant);

//		  9. Write a Java program of swap two elements in an array list.

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(6666);
		numbers.add(114);

		System.out.println("\n");

		System.out.println("before swapping numbers: " + numbers);
		Collections.swap(numbers, 0, 1);
		System.out.println("after swapping numbers: " + numbers);

//		 10. Write a Java program to empty an array list.

		System.out.println("before empty numbers: " + numbers);
		numbers.removeAll(numbers);
		System.out.println("after empty numbers: " + numbers);

// 		11. Write a Java program to trim the virtual capacity of an array list the
// 		 current list size.

		ArrayList<String> phones = new ArrayList<String>();
		phones.add("Samsung");
		phones.add("iphone");
		phones.add("motorolla");
		phones.add("lg");
		phones.add("Nokia");

		System.out.println("size of the phonelist " + phones.size());

		System.out.println("original capacity " + phones);
		phones.trimToSize();
		System.out.println("after trim " + phones);

//		12. Write a Java program to print all the elements of a ArrayList using the
//		  position of the elements
		
		/**
		 * basically i think its same think but here first getting size of array list 
		 * its returning integer then storing in int 
		 * and then using that refferance name iterating
		 */

		ArrayList<String> webSites = new ArrayList<String>();

		webSites.add("youtube");
		webSites.add("google");
		webSites.add("linkedin");
		webSites.add("facebook");
		webSites.add("udemy");
		
		System.out.println("before printing: " + webSites);
		
		int beforePrinting = webSites.size();
		
		System.out.println(beforePrinting);
		
		for (int a = 0; a < beforePrinting; a++) {
			
			System.out.println(webSites.get(a));
		}

	}

	
}


















