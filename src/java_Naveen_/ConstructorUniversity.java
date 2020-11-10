package java_Naveen_;

import java.util.ArrayList;

public class ConstructorUniversity {

	String name;
	String country;
	int totalEnrollment;
	String adress;
	int establishedYear;
	// these two var just to implement private case not true info
	private int revenue;
	private String droppedStudents;
	ArrayList<String> courses;

	public ConstructorUniversity(String name, String country, String adress, int establishedYear) {
		super();
		this.name = name;
		this.country = country;
		this.adress = adress;
		this.establishedYear = establishedYear;
	}

	public ConstructorUniversity(String name, String country, int totalEnrollment, String adress, int establishedYear,
			ArrayList<String> courses) {
		super();
		this.name = name;
		this.country = country;
		this.totalEnrollment = totalEnrollment;
		this.adress = adress;
		this.establishedYear = establishedYear;
		this.courses = courses;
	}

	public int getRevenue() {
		return revenue;
	}

	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}

	public String getDroppedStudents() {
		return droppedStudents;
	}

	public void setDroppedStudents(String droppedStudents) {
		this.droppedStudents = droppedStudents;
	}

	// method encapsualtion

	private void innerPolicy() {
		final int innerLowCount = 59;
		System.out.println("only for members " + innerLowCount);
		System.out.println("applied for students");
	}

	public void getinnerPolicy() {
		innerPolicy();
	}

}
