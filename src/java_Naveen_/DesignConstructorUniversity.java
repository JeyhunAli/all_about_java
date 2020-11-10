package java_Naveen_;

import java.util.ArrayList;

public class DesignConstructorUniversity {

	String name;
	String country;
	int totalEnrollment;
	String adress;
	int establishedYear;
	ArrayList<String> courses;

	public DesignConstructorUniversity(String name, String country, String adress, int establishedYear) {
		super();
		this.name = name;
		this.country = country;
		this.adress = adress;
		this.establishedYear = establishedYear;
	}

	public DesignConstructorUniversity(String name, String country, int totalEnrollment, String adress,
			int establishedYear, ArrayList<String> courses) {
		super();
		this.name = name;
		this.country = country;
		this.totalEnrollment = totalEnrollment;
		this.adress = adress;
		this.establishedYear = establishedYear;
		this.courses = courses;
	}

	public static void main(String[] args) {

		DesignConstructorUniversity uni = new DesignConstructorUniversity
				("Long Island University Brooklyn", "USA", "1 University Plaza, Brooklyn", 1926);
		
		System.out.println(uni.name + ": adress- " + uni.adress+ " country: "+ uni.country+ " established year is: " + uni.establishedYear);
		
		ArrayList <String> courseList = new ArrayList<String>();
		DesignConstructorUniversity uni1 = new DesignConstructorUniversity
				("Long Island University Brooklyn", "USA", 8170, "1 University Plaza, Brooklyn", 1926, courseList);
				
		courseList.add("business");
		courseList.add("the arts");
		courseList.add("pharmacy");
		courseList.add("health sciences");
		courseList.add("financing");
		courseList.add("nursing");
		courseList.add("languages");
		courseList.add("history");
				
		System.out.println(uni1.name + " " + uni1.adress+ " " +
		uni1.establishedYear+ " " +uni1.totalEnrollment + " " +uni1.courses);
		
		for(String ele :  courseList) {
			System.out.println(ele);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
