package Encapsulation;

public class testVerizon {

	public static void main(String[] args) {

		//this calls encapsulation data hide data access 
		//its not only hide info 
		// its also hide unneccesary info to the user which is user not care about 
		
		Verizon v = new Verizon();
		v.Navigate_To_Verizon();
		
		v.setName("Verizon number one");  //setting 
		
		System.out.println(v.getName());   // getting 
	}

}