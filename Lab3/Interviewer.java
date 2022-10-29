
import java.util.Scanner; // at top of the file

public class Interviewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String name;
		String year;
		String major;
		String object;
		String color;
		
		System.out.print("What is your name? "); 
		name = input.next(); 
		System.out.print("Their name is "); 
		System.out.println(name);	
		
		System.out.print("What is your age? "); 
		year = input.next(); 
		System.out.println("Their age is "+ year); 

		
		System.out.print("What is your major? "); 
		major = input.next(); 
		System.out.println("Their major is " + major); 
	
		
		System.out.print("What is your favorite thing? "); 
		object = input.next(); 
		System.out.println("Their favorite thing is " + object ); 
		
		
		System.out.print("What is your favorite color? "); 
		color = input.next(); 
		System.out.print("Their favorite color is "); 
		System.out.println(color);
		
		/*input.nextInt(); // get the next integer number
		input.nextFloat();// get the next floating pointnumber		
		input.nextLine();// get the next string line*/
	}

}
