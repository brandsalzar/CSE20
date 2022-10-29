import java.util.Scanner;

public class Errors2 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int number = 0;
		int theSquare = 0;

		System.out.print("Enter a number and I will ");//System.out.print("Enter a number and I will ") i added the missing semicolon at the end.
		System.out.print("square it for you:  "); //System.out.print("square it for you:  ); It was missing the quotation mark.
			
		number =  kbd.nextInt(); //number =  keyboard.nextInt; changed "keyboard" to "kbd" and added the parenthesis

				theSquare = number * number;// thesquare = number * number; This line was in comment form from the beginning, so I put it as an actual statement and changed the lower case "s" into the capital "S"

	    System.out.print("Squared = " + theSquare);//System.out.print(number + " squared = ";Was missing the ending parenthesis. Reordered the sentence. Added "theSquare" to actually get a squared number.
		                                 //System.out.println("theSquare"); this line seemed unnecessary for me.
	}
}