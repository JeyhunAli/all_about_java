package java_Naveen_;

public class constructorEmployee {

	//class vars:
	String name;
	int age;
	int empId;
	double salary;
	boolean isPermanent;
	char gender;
	
	//constructor of the class:
	//looks like a function, but its not a function
	//const... name will be as same as the class name
	//a function may or may not return a value but const.. will never return a value
	//no return and void keywords in cost....
	//can overload the const...
	//const.. will be called when we create the object of the class.

	
	public constructorEmployee(){ //0 param //default const..
		System.out.println("default emp const...");
		System.out.println("Hello Employee!!!");
	}
	
	public constructorEmployee(int i){
		System.out.println("1 param const.." + i);
	}
	
	public constructorEmployee(int i, String p){
		System.out.println("2 params const.." + i + p);
	}
	
	
	public static void main(String ar[]){
		System.out.println("hello");
		//const.. will be called when we create the object of the class.
		constructorEmployee e1 = new constructorEmployee();
		constructorEmployee e2 = new constructorEmployee(10);
		constructorEmployee e3 = new constructorEmployee(20, "testing");

		
	}
	
	
	
	
	
	
	

}