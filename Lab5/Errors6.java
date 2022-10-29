import java.util.Scanner;

public class Errors6 {

	public static void main(String[] args) {
	
		System.out.println("This program will ask the user for three sets of two numbers and will calculate the average of each set.");

		Scanner input = new Scanner(System.in);

		int n1, n2;

		System.out.print("Please enter the first number:");
		n1 = input.nextInt();

		System.out.print("Please enter the second number:");
		n2 = input.nextInt();

		int average;
		average = (n1+n2)/2;
		System.out.println("The average of the numbers is " + average);// added a new line

		//there was another declaration of scanner here, it was unnecessary so I deleted the "Scanner input = new Scanner(System.in);"
		
		float n3, n4;//You can't declare the same variable twice "float n1, n2"

		System.out.print("Please enter the first number:");
		n3 = input.nextFloat(); //Changed n1 to n3

		System.out.print("Please enter the second number:");
		n4 = input.nextFloat();// Changed n2 to n4

		float _average; // We cannot use "average again changed to "_average"
		_average = (n3+n4)/2; //Changed (n1+n2) to (n3+n4) and average to _average
		System.out.println("The average of the numbers is " + _average); //Changed average to _average and I added a new line

		short s1, s2;

		System.out.print("Please enter the first number:");
		s1 = input.nextShort();

		System.out.print("Please enter the second number:");
		s2 = input.nextShort();

		short shortAvg;
		shortAvg = (short)((s1+s2)/2);//Changed (n1+n2) to (s1+s2) and converted (s1+s2)/2 to ((s1+s2)/2)
		System.out.println("The average of the numbers is " + shortAvg); //added a new line
	
	    input.close();
	}

}
