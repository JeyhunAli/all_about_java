package java_Naveen_;

public class StaticVsNonStaticConcept {
	/**
	 * static is always aplied for class variable not in the method variable 
	 * to method variable we can apply as final 
	 * 
	 * 
	 */

	String name;
	static int age;

	public void getName() {
		System.out.println("get name");
	}

	public static void getEmail() {
		System.out.println("get email");
	}

	public static void main(String[] args) {
		
		//1. how to access non static stuff: create the object
		/**
		 * when we are creating object of any particular class it will hold only non static stuff not static 
		 * by the class name i can access only static stuff not non static
		 * 
		 * we can access ststic stuff by creating object of that class but we will get warning yellow line it 
		 * says access static stauff in aststic way 
		 * what is the static way either directly calling or by class name 
		 * 
		 * <<<< why main method is static >>>>>>
		 * because we are not creating object of it to call and execute whenever we write any program under main method its calling automatically 
		 * and execute 
		 * 
		 * and main method is also cma
		 * 
		 * <<<why main method is void in nature because main method for executing point its never return anything
		 */
		
		StaticVsNonStaticConcept obj = new StaticVsNonStaticConcept();
		obj.name = "Tom";
		System.out.println(obj.name);
		obj.getName();
		obj.age = 45;
		obj.getEmail();
		
		//2. how to access static stuff:
		//a. call them directly
		getEmail();
		age = 20;
		System.out.println(age);
		
		//b. call them by class name:
		StaticVsNonStaticConcept.age = 30;
		System.out.println(age);
		StaticVsNonStaticConcept.getEmail();
		

	}

}
