import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int i = 0;
		int totalSum = 0;
		int number = 0;

		while ( i < max) {
			System.out.println("Enter a number:");
			number = input.nextInt();
			
			System.out.println("Number " + number);
			totalSum += number;
			i++;
		}
		System.out.print("The average is: " + (totalSum / max) );
		input.close();
	}
	/*Program asks the user to input any number 
(similar to TenAverage.java from Lab 8 but not limited to 0-10)
"•Ask the # to average from 0 to whatever number chosen"
•Print out the average of the numbers"
	 */
}
