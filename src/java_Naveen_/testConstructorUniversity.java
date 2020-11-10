package java_Naveen_;

import java.util.ArrayList;

public class testConstructorUniversity {

	public static void main(String[] args) {

		ConstructorUniversity uni = new ConstructorUniversity("Long Island University Brooklyn", "USA",
				"1 University Plaza, Brooklyn", 1926);

		System.out.println(uni.name + ": adress- " + uni.adress + " country: " + uni.country + " established year is: "
				+ uni.establishedYear);
		
		

		ArrayList<String> courseList = new ArrayList<String>();
		ConstructorUniversity uni1 = new ConstructorUniversity("Long Island University Brooklyn", "USA", 8170,
				"1 University Plaza, Brooklyn", 1926, courseList);

		courseList.add("business");
		courseList.add("the arts");
		courseList.add("pharmacy");
		courseList.add("health sciences");
		courseList.add("financing");
		courseList.add("nursing");
		courseList.add("languages");
		courseList.add("history");

		System.out.println(uni1.name + " " + uni1.adress + " " + uni1.establishedYear + " " + uni1.totalEnrollment + " "
				+ uni1.courses);

		for (String ele : courseList) {
			System.out.println(ele);

		}
		System.out.println("-------------------");

		uni.setDroppedStudents("chickenLeg");

		System.out.println(uni.getDroppedStudents());
		
		
		
		uni.setRevenue(1000000000);
		System.out.println("of course the revenue is more this but its just guess " +uni.getRevenue());
		System.err.println("i think revenue shoud declare with long not int )))");
		
		
		uni.getinnerPolicy();
		
		

	}
}