import java.util.Scanner;

public class SumSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner square = new Scanner(System.in); //Scanner multiScan = new Scanner(System.in);
		
		int totalSum = 0;
		
		System.out.println("Please enter the max number: ");
		int max = square.nextInt();
		
		for( int i = 1 ; i <= max; i++ ) {
			System.out.println("Number " + i + " squared is " + (i * i) );
			totalSum += i * i ;
		}
		
		System.out.println();
		System.out.println("Sum of squares is: " + totalSum );
		
		square.close();
	}

}
