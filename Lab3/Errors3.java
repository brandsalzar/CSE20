import java.util.Scanner;

public class Errors3 { //public class Errors3 was missing the ellipsis

	public static void main(String[] args) {
	Scanner kbd = new Scanner(System.in);//Scanner kbd = new Scanner System.in;added the necessary parenthesis.
		int numerator = 0;      //Int numerator; Rewrote line so it can be an integer and set it to zero so the user can input their number.
	    int denominator = 0;	    //integer denominator; Rewrote line so it can be an integer and set it to zero so the user can input their number.

	    System.out.println("This program divides two numbers.");	//System.println("This program divides two numbers."); It was missing the "out" part.
	    System.out.print("Enter the numerator: ");//System.print("Enter the numerator: ");It was missing the "out" part.
		
	    numerator = kbd.nextInt();
		
	    System.out.print("Enter the denominator: ");
		
	    denominator = kbd.nextInt(); //denomintaor = kbd.nextInt();Spelling error for the word "denominator"

	    System.out.print(numerator);//system.out.print(numerator); Changed lower case letter to upper case.
		System.out.print("/");
		System.out.print(denominator);//system.out.Print(denominator); Changed lower case letter "s" to upper case and the upper case letter "P" to lower case.

		System.out.print(" = ");
		System.out.println((double) numerator/denominator);//System.out.Println((double) numerator/denominator);Changed upper case letter to  lower case.
	}
} // another ellipsis was missing here