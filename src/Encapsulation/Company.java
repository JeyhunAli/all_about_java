package Encapsulation;

public class Company {
	
	
	public String companyName;
	public String companyLogo;
	public int totalEmp;
	private int revenue;
	private int tenderAmount;
	public String CEO;
	
	
	// to set class var ----->>> constructor of the class var
	public Company(String companyName, String companyLogo, int totalEmp, int revenue, int tenderAmount, String cEO) {
		this.companyName = companyName;
		this.companyLogo = companyLogo;
		this.totalEmp = totalEmp;
		this.revenue = revenue;
		this.tenderAmount = tenderAmount;
		CEO = cEO;
	}
	
	public Company() {
		
	}


	//getters and setters 

	
	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getCompanyLogo() {
		return companyLogo;
	}


	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}


	public int getTotalEmp() {
		return totalEmp;
	}


	public void setTotalEmp(int totalEmp) {
		this.totalEmp = totalEmp;
	}


	public int getRevenue() {
		return revenue;
	}


	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}


	public int getTenderAmount() {
		return tenderAmount;
	}


	public void setTenderAmount(int tenderAmount) {
		this.tenderAmount = tenderAmount;
	}


	public String getCEO() {
		return CEO;
	}


	public void setCEO(String cEO) {
		CEO = cEO;
	}
	
	
	
	
	
	
	

}
