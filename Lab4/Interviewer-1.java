
import java.util.Scanner; // at top of the file

public class Interviewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		input.useDelimiter(System.getProperty("line.separator"));  // add 
		
		String name;
		String year;
		String major;
		String object;
		String color;
		int weightPounds;
		int weightKilos;
		
		System.out.print("What is your name? "); //questions start here
		name = input.next(); 	
		
		System.out.print("What is your age? "); 
		year = input.next(); 
		
		System.out.print("What is your major? "); 
		major = input.next(); 
		
		System.out.print("What is your favorite thing? "); 
		object = input.next(); 
			
		System.out.print("What is your favorite color? "); 
		color = input.next(); 
		
		System.out.print("What is your weight in pounds? "); 
		weightPounds = input.nextInt(); 
		
		weightKilos = (int)(weightPounds / 2.2);
		
		   System.out.println();
		
		System.out.print("His name is "); //answers start here
		System.out.print(name);
		
		System.out.println(", his age is "+ year + ","); 
		
		System.out.println("the major of his choice is " + major + ","); 
		
		System.out.print("his favorite thing is " + object + ","); 
		
		System.out.print(" his favorite color is "); 
		System.out.println(color + ",");
		
		System.out.print("his weight in pounds is " + weightPounds + "lbs ");
		System.out.println("and his weight in kilograms is " + weightKilos + "kg."); 
	
		
	}

}
