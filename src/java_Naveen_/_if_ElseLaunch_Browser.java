package java_Naveen_;

public class _if_ElseLaunch_Browser {

	
	static String browser = "chrome";
	
	
	public static void main(String[] args) {
		
		/**
		 * 
		 * now as you see there're if else 
		 * and if condition in each line 
		 * differences:  first case will check which code line is matching as soon as it find it it will stop go forward 
		 * second case it will check each and every line 
		 * 
		 */

		
		
		if(browser.equals("chrome")){
			System.out.println("launch chrome");
		}
		else if(browser.equals("firefox")){
			System.out.println("launch firefox");
		}
		else if(browser.equals("safari")){
			System.out.println("launch safari");
		}
		else if(browser.equals("ie")){
			System.out.println("launch IE");
		}
		else{
			System.out.println("you are passing browser:" + browser +" Please pass the correct browser name");
		}
		
		
		//********************************************************************************************
		//case2:only IFs
		if(browser.equals("chrome")){
			System.out.println("launch chrome");
		}
		 if(browser.equals("firefox")){
			System.out.println("launch firefox");
		}
		 if(browser.equals("safari")){
			System.out.println("launch safari");
		}
		 if(browser.equals("ie")){
			System.out.println("launch IE");
		}
		
		
		
	}

}


