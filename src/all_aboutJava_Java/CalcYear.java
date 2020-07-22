package all_aboutJava_Java;

import java.time.LocalDate;
import java.time.Period;

public class CalcYear {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1988, 02, 01);
		
		int years = Period.between(birthday, today).getYears();
		
		System.out.println(years);
		
		
		
		
		
		
		
		
		
	}

}
