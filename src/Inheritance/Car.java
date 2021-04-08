package Inheritance;

/**
 * 
 * @author jey
 * 
 *         Inheritance is happening only between child and parent multiple
 *         Inheritance is not allowed
 * 
 *         inheritance in java is not also allowed from siblings as well for
 *         example car is the parent class bmw, audi, toyota, ford are classes
 *         bwm cannot inherit anything from totyoa they both can inherit from
 *         car only this problem called in java in iheritance concept like
 *         dimond problem dimond problem we can solve with interface concept
 * 
 *         Oops concept inheritance Inheritance concept in java to inherit
 *         properties from parent class we cannot inherit from multiple parent
 *         Only one parent But we have multilevel inheritance How is that works
 *         Child class can access to parent class and as well ass parent of
 *         parent class This calls multilevel inheritance between child classes
 *         there's no relationship but they have common parent In inheritance we
 *         are achieving method overriding Same class in parent class and we
 *         override it in child class with same name Keyword of inheritance
 *         concept is extends Most of the time in inheritance concept parent
 *         class child class And test class we creating to achieve inheritance
 *         concept and method overriding In test class we can create object of
 *         child class and we can access it In test class if we accessing child
 *         class by object name child class will call by jvm ---(java virtual
 *         machine) which is same method is in parent as well This call method
 *         overriding and jvm will decide to run child class not the parent
 *         class Its good practice in child class to add @override method
 *         annotations which is override method Same method same parameters .
 *         Run time polymorphism means When we have same method in parent and in
 *         child class at the run time java compiler will decide to run child
 *         class method this calls runtime polymorphism
 *         
 *         inherited methods, overriden methods, separete methods 
 *         same method in parent class and same method with exact name and exact paramaters 
 *         in child class is called method overriding 
 *         we can proove it with @override key word in child class 
 * 
 *         Method overloading while runtime its calls compile time polymorphism
 *         in test class while when we create object of child class 
 *         and at the runtime it will pick child class methods and execute 
 *         and it calls runtime polymorphism or dynamic polymorphism
 *         
 *         
 *         
 *         
 * 
 *         In test class we can access all the methods which is available in
 *         parent and child In inheritance we can create object of parent class
 *         as well Once we creating object of parent class At time of running it
 *         will pick parent class methods
 * 
 *         Creating child class object without any reference name it's possible
 *         Like New child(); in this time parent class will take care of child
 *         class
 * 
 *         Child class object can be referred by parent class reference variable
 *         In this case child class method will call Not parent class And also
 *         in this class we can access parent class property as well
 * 
 *         Once we creating child class object by parent class reference name We
 *         cannot access child class own, SEPARATE method which is its only in child they
 *         are not belong to parent class method why because of the
 * 
 *         <<<<<<<<<<Reference type signature checking concept>>>>>>>>>>>>
 * 
 *         This method available only in child class Because of the security
 *         This is call top casting in java There is also down casting If we are
 *         creating parent class object by child class reference variables its
 *         calls down casting but its gonna give some error If we run it its
 *         gonna give error Class cast exception Down casting we dont use
 * 
 * 
 *         Web driver driver = chrome driver this is top casting
 * 
 *         It looks like we can put small box into large box top casting
 * 
 *         Large box into small box down casting
 * 
 *         In inheritance concept we can access to grandparent property as well
 *         in child class
 * 
 *         We can do top casting between child and grandparent class but we
 *         cannot access child class property because of the security issue and
 *         parent class cannot access child class property
 * 
 *         Static method cannot be override But it can overload
 * 
 *         If in parent class some method is with final keyword that method
 *         cannot be override
 * 
 *         If parent class itself is final That class cannot have child class
 *
 */

// overriding is customizing existing method in parent class to child class by 
//creative or owned way with same name and same paramaters 
//@override  it is good practice to write in overriden method 
// when somebody says diamond problem it means multipul inheritance 
//to solve this issue we use interface 
public class Car extends Vehicle {

	public void start() {
		System.out.println("car -- start");
	}

	public void stop() {
		System.out.println("car -- stop");

	}

	public void refuel() {
		System.out.println("car -- refuel");

	}

	private String carName(String name) {
		System.out.println("car name " + name);
		return "Car Name";
	}

}