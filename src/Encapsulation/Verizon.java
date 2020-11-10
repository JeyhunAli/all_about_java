package Encapsulation;

public class Verizon {
	
	private String name;
	private String logo;
	private int totalSubsciber;
	private int revenue;
	

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	

	public void Navigate_To_Verizon() {
		
		System.out.println("verizon is navigated.....");
		dealsOf_Verizon();
	}
	
	private void dealsOf_Verizon() {
		System.out.println("many deals are available");
		internetOf_Verizon();
	}
	
	private void internetOf_Verizon() {
		System.out.println("high speed internet");
		numberOfCustomer_Verizon();
		
	}
	
	private void numberOfCustomer_Verizon() {
		
		System.out.println(" n number of them ");
	}
	
	public int getRevenue() {
		System.out.println(10000);
		return revenue;
	}
	

}
