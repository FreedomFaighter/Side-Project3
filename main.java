import java.util.Scanner;

public class Chapter8PPMatthewRoberts {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//declare variables
		final int NUMBER = 12;
		String[] monthName = {"Jan.","Feb.","Mar.","Apr.","May", "Jun.", "Jul.", "Aug.", "Sept.", "Oct.", "Nov.", "Dec."};//showing the user which month to input earnings
		double[] firstYearEarnings = new double[NUMBER]; //the earnings for 2018
		double[] secondYearEarnings = new double[NUMBER];//the earnings for 2017
		double[] earningDifference = new double[NUMBER];//subtracts the earnings (2018 - 2017) and outputs the result 
		
		
		//get user input
		System.out.println("Enter the earnings for 2018 followed by the earnings for 2017 for the month prompted. ");
		for(int i = 0; i < NUMBER; i++) {
			System.out.println(monthName[i] + " ");
			firstYearEarnings[i] = scan.nextDouble();//takes the user input for the 2018 earnings
			secondYearEarnings[i] = scan.nextDouble();//takes the user input for the 2017 earnings
		}
		//calculations
		for(int i = 0; i < NUMBER; i++) {
			earningDifference[i] = (firstYearEarnings[i] - secondYearEarnings[i]);
		}
		
		System.out.println("Month           2018            2017         Difference");//prints above the data to further explain what each result means
		for(int i = 0; i < NUMBER; i++){//the below loop prints out the elements to include the 2018 and 2017 earnings, and the difference of the years for that month
			System.out.println(monthName[i] + "\t\t" +
		                       firstYearEarnings[i] + "\t\t" +
					           secondYearEarnings[i] + "\t\t" +
		                       earningDifference[i]);
				
		}
		
			
	
	}

}
