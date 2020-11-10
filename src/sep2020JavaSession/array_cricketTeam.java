package sep2020JavaSession;

public class array_cricketTeam {

	public static void main(String[] args) {
		
		
//		Question 2: Write a program to create a static Array, having following cricket data:
//			 *  --name, age, team name, DOB, gender, Strike Rate
//			 *  --Try to create multiple Object Arrays for different players
//			 *  --Try to print all the values of each player on the console
		
	//  String [] cricketData = {"name", "age", "team name", "DOB", "gender", "Strike Rate", "Captain", "Coach", "Founded",""};
		
	  String [] cricketData = new String [10];

		
		cricketData[0] = "Saurabh Netravalkar";
		cricketData[1] = "28";
		cricketData[2] = "United States national cricket team";
		cricketData[4] = "October 16, 1991";
		cricketData[5] = "M";
		cricketData[6] = "22";
		cricketData[7] = "Saurabh Netravalkar";
		cricketData[8] = "James Pamment";
		cricketData[9] = "1965";
		
		
		for(int i=0; i<cricketData.length; i++) {
			System.out.println(cricketData[i]);
		}
		
		
		
		
	}

}
