import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputEven = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = inputEven.nextInt();
		int i = 0;
		while ( i <= max) {
			if(i % 2 == 0)
				System.out.println("Number " + i);
			i++;

			inputEven.close();}

	}

}
