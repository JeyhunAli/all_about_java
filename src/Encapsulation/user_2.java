package Encapsulation;

public class user_2 {

	public static void main(String[] args) {


		User_1 u = new User_1("Jeyhun", 30, 2000, "New-York");

		System.out.println(u.age);
		System.out.println(u.name);
		int usersalarymethod = u.getSalary();
		System.out.println(usersalarymethod);
		String ad = u.getUserAddress();
		System.out.println(ad);





	}

}
