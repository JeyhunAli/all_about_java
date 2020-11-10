package all_aboutJava_Java;

import java.util.ArrayList;

public class FoR_EachLoop {

	public static void main(String[] args) {
		
          
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("BMW");
		cars.add("Veloster");
		cars.add("GTI");
		cars.add("mercedes");
		cars.add("toyota");
		
		for(int i=0; i<cars.size(); i++) {
			
			System.out.println(cars.get(i));
			
		}
		
		System.out.println("***************************************");
		
		for(String carsss : cars) {
			
			System.out.println(carsss);
		}
	}

}
