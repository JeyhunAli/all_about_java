package java_Naveen_;

public class Car {
	/**
	 * 
	 * here because of the wheels1 is static we can access directly or by class name also we can change the given value of the wheels 
	 * if i declare as final static then i cannot change the given value 
	 * 
	 * common memory allocation cma  it applicable for all the class 
	 */

	String name;
	String color;
	int price;
	String model;

	static final int wheels = 4;
	final static  int  wheels1 = 5;

	public static void main(String ar[]) {

		Car c1 = new Car();
		c1.name = "Audi";
		c1.color = "Red";
		c1.price = 75;
		c1.model = "Q5";
	  
		Car c2 = new Car();
		c2.name = "BMW";
		c2.color = "Blue";
		c2.price = 80;
		c2.model = "520d";

		System.out.println(c1.name + " " + c1.color);
		System.out.println(Car.wheels);
		System.out.println(Car.wheels1);

	}

}