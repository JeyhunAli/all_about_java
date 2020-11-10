package Encapsulation;

public class testCompany {

	public static void main(String[] args) {

		Company c = new Company();
		
		c.setCEO("Jeyhun");
		c.setCompanyLogo("DataBase");
		c.setCompanyName("FutureData");
		c.setCompanyLogo("logo");
		c.setRevenue(100000);
		c.setTenderAmount(100000);
		c.setTotalEmp(10000);
		
		
		
		System.out.println(c.CEO);
		System.out.println(c.companyLogo);
		System.out.println(c.companyName);
		System.out.println(c.totalEmp);
		System.out.println(c.getRevenue());
		System.out.println(c.getTotalEmp());
		System.out.println(c.getTenderAmount());



		
		
	}

}
