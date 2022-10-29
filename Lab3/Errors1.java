import java.util.Scanner;                   // The program was missing this line of code so  put it on the top
public class Errors1 {

	public static void main(String[] args) {
		System.out.println("Can you spot and fix the errors?"); //System.out.println("Can you spot and fix the errors?); was missing a " inside the parenthesis.

		System.out.println("Enter two numbers and I will ");//System.out.println("Enter two numbers and I  "); Gramarly error, added "will".
		System.out.println("add them for you");

		int n1, n2;

		Scanner input = new Scanner(System.in); //Scanner keyboard = new Scanner(System.in) I changed "keyboard" to "input" and added the semicolon at the end.
		n1 = input.nextInt(); //n1 = nextInt(); Added "input" at the beginning.
		n2 = input.nextInt(); //n2 = nextint();Added "input" at the beginning and changed the lower case "i".

		System.out.println("The sum of the numbers is"); //System.println("The sum of the numbers is"); the string was missing the "out" part.
		System.out.println(n1 + n2);//System.out.println(n1 - n2); this line of code was subtracting instead of adding, so I changed it to adding.
	}
}