import java.util.Scanner;

public class Errors4 {

	public static void main(String[] args) {

		int n1, n2;
		
		Scanner keyboard = new Scanner(System.in); // deleted the unnecessary "Scanner keyboard;" line

		System.out.println("Enter two ints and we print out sum as an int.");

		System.out.print("Enter the first number: ");
		n1 = keyboard.nextInt(); //This statement was in the wrong place.

		System.out.print("Enter the second number: ");
		n2 = keyboard.nextInt();//this should not be used "n2 = keyboard.nextShort();" to get an int

		System.out.println("The sum of the numbers is " + (n1+n2)); // This statement was printing out in (float) instead of int
		
		keyboard.close();
	}

}