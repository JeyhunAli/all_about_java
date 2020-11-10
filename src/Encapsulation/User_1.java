package Encapsulation;

/**
 * 
 * @author jey
 * 
 * // encapsulation is one of the oops consept 
//there 3 oops consepts they are called PIE factor 
//polymorphism, inheritence, encapsulation.
 * 
 * encapsulation is data hiding
 * 
 * encapsulation is creating with private key word once any method or instance variables declared with private key word 
 * it can be acccesibale only within the class 
 * 
 * to access the class variable encapsulation we have to create one public layer public method then we can access 
 * we dont have direct access to private property
 * 
 * to access the class method encapsulation  we have to create one public layer public method then we can access 
 * for that just call private method inside public method in same class then access 
 * in test class to the public class which is holding private method property
 * 
 * 
 * note: constructor also used for set the value then we can access 
 * encapsulation also uses setters and getters what is the differences 
 * 
 * first of all cosntructor can be default can be with paramt if constructor is used to access class var 
 * so then no need to create object of that calss again again 
 * 
 * but encapsulation is data hiding getters and setters so felxiable for addind data addinf method 
 * even private method we can set and we can get 
 * lets say data or requirements are dynamic we have to keep increate and decrease the value and method with setters and getters is 
 * easy compare constuctor 
 * with the constructor need to crrate object again and again 
 * 
 * 
 * if in the method default constructor and cosnturoctor with the param 
 * in the test class once i created the object of it 
 * it will pick default constructor 
 * 
 * 
 *
 */

public class User_1 {
	
	
	public String name;
	public int age;
	private int salary;
	private String adress;
	
	public void getuserinfo() {
		System.out.println("user info 1234");
	}
	
	
	
	public User_1(String name, int age, int salary, String adress) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.adress = adress;
	}



	public void getUser_adress() {
		System.out.println("user adress");
	}
	
	private void getBank_Account() {
		System.out.println("bank account number is 567t7654we67686");
		
	}
	
	public void getUserBankData() {
		getBank_Account();
		
	}
	 public int getSalary() {
		 System.out.println("user1 salary " + salary);
		 return salary;
	 }
	 
	 public String getUserAddress() {
		 return adress;
	 }
	 
	
	

}
