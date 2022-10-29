import java.util.Scanner;

public class Errors5 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); //Deleted the unnecessary "Scanner keyboard;".
	
		int weight, age;//These  variables where declared after the question.
		
		System.out.print("What is your weight in kg? " );
	    weight = keyboard.nextInt();

		System.out.print("What is your age? ");
		age = keyboard.nextInt();

		System.out.println("Wow you are " + (int) (age*6.9) + " in dog years.");
		System.out.println("Your weight in lbs is " + (int) (weight * 2.2) + " with no decimal point"); //The program was not treating "weight * 2.2" as a whole.
	
		keyboard.close();
	}

}