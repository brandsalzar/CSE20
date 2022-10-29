import java.util.Scanner;
public class Bobcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 

		int discount = 0;
		double platPack = 0;
		int carPick = 0;
		String carDisplay = "N/A";

		System.out.println("Available cars: 1 for Economy, 2 for Compact, 3 for Standard" );
		System.out.println("Please choose the rental car: ");
		int car = input.nextInt();

		if( car == 1){
			carDisplay = "Economy";
			carPick = 35;
		}
		else {
			if( car == 2) {
				carDisplay = "Compact";
				carPick = 45;
			}
			else {
				if( car ==3 ) {
					carDisplay = "Standard";
					carPick = 95;
				}
			}
		}
		System.out.println("Please enter the number of rental days: ");
		int days = input.nextInt();

		System.out.println("Club member? 1 for yes, 0 for no: ");
		int clubMemb = input.nextInt();

		if(clubMemb == 1) {
			discount = (days/7) * carPick ;
		}
		else {
			discount = 0;
		}

		System.out.println("Platinum Executive Package? 1 for yes, 0 for no: ");
		int platExec = input.nextInt();

		if(platExec == 1) {
			platPack = (days * carPick) * 0.15;
		}
		else {
			platPack = 0;
		}


		System.out.println("\nBase: " + days + " days for a " + carDisplay + " @ $" + carPick + " per day: " + " $ " + (days * carPick)); 

		if(clubMemb == 1) {System.out.println("Club Member Discount: " + " - $ " + discount ); }

		if(platExec == 1)System.out.println("Platinum Executive Package: " + " + $ " + platPack ); 

		System.out.println("\nTotal Estimate for Rental: " + " $ " + ((days * carPick) + platPack - discount));

		input.close();
	}

}
