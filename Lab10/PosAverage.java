import java.util.Scanner;

public class PosAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner posAvg = new Scanner(System.in);

		int userNum = 0;
		int i = 0;
		int posSum = 0;

		do {
			System.out.println("Enter number " + i + " number: ");
			userNum = posAvg.nextInt();
			if(userNum > 0) {
				posSum += userNum;
				i++;
			}
			
		}
		while( userNum > 0);

		System.out.println();
		System.out.println("Average is: " + (posSum / i));

		posAvg.close();
	}
}
