import java.util.Scanner;

public class AnyAverageArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("This program will find the average of any numbers");
		System.out.println("Please choose amount of numbers to average : ");

		int max = input.nextInt();

		int num = 0;
		int [] keep = new int [max];

		for(int i = 0; i<max; i++) {
			System.out.println("Please enter number " + i + " number: ");
			num = input.nextInt();
			keep[i] = num;
		}
		int total = 0;

		System.out.println("The numbers being average:  ");

		for(int index = 0; index < keep.length; index++) {
			if (index % 5 == 0) {
				System.out.println( );
			}
			System.out.print(keep[index] + " ");
			total= total + keep[index];
		}
		System.out.print("\nAverage is: "+ (total/max));
		input.close();
	}
}
/*Declaration Form:
			<type> [] <var>;
	Examples:
			int [] intArr;
			double [] doubleArr;
			String[] stringArr;
	The general form of array construction is:
			<var> = new <type> [<int expression>]
	Examples:
			intArr = new int[100];
			doubleArr = new double[max];
			stringArr = new String[max+100];
	Declaration with initialization:
			<type> [] <var> = new <type> [<int expression>]
			<type> [] <var> = { <type>, <type>, … , <type> }
	Examples:
			int[] intArr = new int[10];
			int[] intArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	Access:
			0th entry of intArr is intArr[0]
			1st entry of inArr is intArr[1]*/


