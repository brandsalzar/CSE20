import java.util.Scanner;

public class TenAverage {

	public static void main(String[] args) {
		
		System.out.println("This program will find the average of up to 10 numbers");

		Scanner input = new Scanner(System.in);

		int count, total, runningCount;

		System.out.print("Please choose amount of numbers to average (1-10 numbers total): ");
		count = input.nextInt();

		runningCount = count;
		total = 0;
		
		if (runningCount > 10) {
			System.out.println("That number is too big, please try again and choose a number from 0 to 10.");
		}
		
		if (runningCount == 10) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			int num = input.nextInt();
			total = total + num;
			runningCount = runningCount - 1;
		}
		
		if (runningCount == 9) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			int num = input.nextInt();
			total = total + num;
			runningCount = runningCount - 1;
		}
		
		if (runningCount == 8) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			int num = input.nextInt();
			total = total + num;
			runningCount = runningCount - 1;
		}
		
		if (runningCount == 7) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			int num = input.nextInt();
			total = total + num;
			runningCount = runningCount - 1;
		}
		
		if (runningCount == 6) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			int num = input.nextInt();
			total = total + num;
			runningCount = runningCount - 1;
		}

		if (runningCount == 5) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			int num = input.nextInt();
			total = total + num;
			runningCount = runningCount - 1;
		}

		if (runningCount == 4) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			total = total + input.nextInt();
			runningCount = runningCount - 1;
		}

		if (runningCount == 3) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			total += input.nextInt();
			runningCount = runningCount - 1;
		}

		if (runningCount == 2) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			total += input.nextInt();
			runningCount--;
		}

		if (runningCount == 1) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			total += input.nextInt();
			--runningCount;
		}

		if (count > 0 && count <= 10)
			System.out.println("Average is " + (total/count));
		else
			{System.out.println("There are no numbers to average");
			}
		
		
		input.close();
	}
}