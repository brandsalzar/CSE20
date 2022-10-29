import java.util.Scanner;

public class SumAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inputUser = new Scanner(System.in);

		System.out.print("Please enter the max number: ");

		int max = inputUser.nextInt();
		int i = 0;
		int totalSum = 0;

		while ( i <= max) {
			System.out.println("Number " + i);
			totalSum += i;
			i++;
		}

		System.out.print("Sum of All is: " + totalSum);

		inputUser.close();
	}

}
