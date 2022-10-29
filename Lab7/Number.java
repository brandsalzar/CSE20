import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
	    
		String [] alpha = {"A","B","C","D","E",
				           "F","G","H","I","J",
				           "K","L","M","N","O",
				           "P","Q","R","S","T",
				           "U","V","W","X","Y","Z"};
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 0-25: ");
		int num = input.nextInt();                       //Changed to int
		
		if( num >= 0 &&  num <= 25)
			System.out.println(num + " character of the alphabet is " + alpha[num]);
		else 
			System.out.println("Outside of acceptable range.");
	
		
	  input.close();
          }
	}


//System.out.println((char)(65 + num));