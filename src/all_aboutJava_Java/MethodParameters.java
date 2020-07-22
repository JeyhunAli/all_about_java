package all_aboutJava_Java;

public class MethodParameters {

	public static void main(String[] args) {

		print_Info("Jeyhun", 32, "NewYork");
		Chloe_Data("chloe", 8, " color black and white mix ", " favorite_activity is pooping" );
		
		
		
	}
	
	
	public static void print_Info(String name, int age, String city) {
		
		System.out.println(name + " is " +  age + " years old "  + 
		"and lives in beautiful bright " +city);
		
		
	}

	public static void Chloe_Data(String name, int age, String color, String favorite_activity) {
		
		System.out.println(name + " is "+ age + " years old" + color  + favorite_activity + "  )))))");
	}
	
}
