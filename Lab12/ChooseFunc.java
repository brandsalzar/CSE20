import java.util.Scanner;
public class ChooseFunc {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("This program supports 4 functions of a max number:");
		System.out.println("\t1. SumAll");
		System.out.println("\t2. SumSquare");
		System.out.println("\t3. Factorial");
		System.out.println("\t4. Fibonacci");

		do{
			System.out.print("Please choose the function you want:");
			int func = input.nextInt();

			System.out.print("Please enter the max number: ");
			int max = input.nextInt();
			long [] resArr = new long [max+2];

			for (int i = 1; i <= max; i++ ) {
				if (func == 1) {
					resArr[i] = resArr[i-1] + i; // Works!!!
				} else if (func == 2) {
					resArr[i] = i * i; // Fill-in (Sum Square) Works!!!
				} else if (func == 3) {
					resArr[0] = 1;
					resArr[i] = resArr[i-1] * i;// Fill-in (Factorial) 
				} else if (func == 4) {	
						if( i == 1 ) {
							resArr[1] = 1;}
						else {
							resArr[i] = (resArr[i-1] + resArr[i - 2]);}// Fill-in (Fibonacci)
				} 
				else {
					System.out.println("Error: Do not know " + func);
					break;// Fill-in (Stop the for-loop from iterating) Works!!!
				}
			}

			System.out.print("Do you wish to repeat inputs? (1 for yes): ");
			if (input.nextInt() == 1) {
				continue;// Fill-in (should go back to top of the loop) Works!!!
			}

			System.out.print("Do you wish to print out all the results? (1 for yes): ");
			if (input.nextInt() == 1) {
				System.out.println("Results in the array:");
				System.out.println("\tIndex\tValue");
				for (int i = 0; i <= max;i++) {
					System.out.println("\t"+ i +"\t"+ resArr[i]);	// Fill-in (print out the array index and the content) Works!!!
				}

			}

			System.out.print("Do you wish to end the program? (1 for yes): ");
			if (input.nextInt() == 1) {
				break;// Fill-in (End the while(true) loop) Works!!!
			}			
			else { 
				continue;
			}

		}while(true);
		
		input.close();
	}
}
