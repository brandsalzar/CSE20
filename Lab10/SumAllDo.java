import java.util.Scanner;

public class SumAllDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputUser = new Scanner(System.in);

		System.out.print("Please enter the max number: ");

		int max = inputUser.nextInt();
		int i = 0;
		int totalSum = 0;

		do{
			System.out.println("Number " + i);
			totalSum += i;
			i++;
		}
		while ( i <= max);

		System.out.print("Sum of All is: " + totalSum);

		inputUser.close();
	}

}
/*Scanner input = new Scanner(System.in);

System.out.print("Please enter the max number:");

int max = input.nextInt();
int i = 0;
do {
	System.out.println("Number " + i);
	i++;
} while ( i <= max);
 */