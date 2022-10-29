import java.util.Scanner;

public class SumAllFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputUser = new Scanner(System.in);

		System.out.print("Please enter the max number: ");

		int max = inputUser.nextInt();
		int totalSum = 0;

		for (int i = 0; i <= max; i++) {
			System.out.println("Number " + i);
			totalSum += i;
		}

		System.out.print("Sum of All is: " + totalSum);

		inputUser.close(); 

	}

}

/*Scanner input = new Scanner(System.in);

System.out.print("Please enter the max number:");

int max = input.nextInt();

for (int i = 0; i <= max; i++) {
	System.out.println("Number " + i); */