import java.util.Scanner;

public class DataAnalyze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the sample size: ");
		int  sampSize= input.nextInt();

		int tra1 = 0;
		int tra2 = 0;
		int tra3 = 0;
		int tra4 = 0;

		int[]arr1 = new int[sampSize];
		int[]arr2 = new int[sampSize];
		int[]arr3 = new int[sampSize];
		int[]arr4 = new int[sampSize];

		System.out.println("Enter numbers for Trial 0");

		for(int tri0 = 0 ; tri0 < arr1.length ; tri0++ ) 
		{
			System.out.println("Enter Sample #" + tri0 +":");
			arr1[tri0] = input.nextInt(); 
			tra1 += arr1[tri0];
		}		

		System.out.println("Enter numbers for Trial 1");

		for(int tri1 = 0 ; tri1 < arr2.length ; tri1++ ) 
		{
			System.out.println("Enter Sample #" + tri1 +":");
			arr2[tri1] = input.nextInt(); 
			tra2 += arr2[tri1];
		}		

		System.out.println("Enter numbers for Trial 2");

		for(int tri2 = 0 ; tri2 < arr3.length ; tri2++ ) 
		{
			System.out.println("Enter Sample #" + tri2 +":");
			arr3[tri2] = input.nextInt(); 
			tra3 += arr3[tri2];
		}		

		System.out.println("Enter numbers for Trial 3");

		for(int tri3 = 0 ; tri3 < arr4.length ; tri3++ ) 
		{
			System.out.println("Enter Sample #" + tri3 +":");
			arr4[tri3] = input.nextInt(); 
			tra4 += arr4[tri3];
		}		

		System.out.println("\tSample #\tTrial 1\tTrial 2\tTrial 3\tTrial 4"); 

		for(int i = 0; i < sampSize; i++)
		{
			System.out.println("\t"+ i +"\t\t"+ arr1[i] +"\t"+arr2[i]+"\t"+arr3[i]+"\t"+arr4[i] );
		}

		System.out.println("\t------------------------------------------------");
		System.out.println("\tAverage"+"\t\t"+(tra1/sampSize) +"\t"+(tra2/sampSize)+"\t"+(tra3/sampSize)+"\t"+ (tra4/sampSize)+"\n" );

		int[]avg = {(tra1/sampSize),(tra2/sampSize),(tra3/sampSize),(tra4/sampSize)};

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for(int i = 0; i < avg.length; i++) {
			if(min > avg[i]){
				min = avg[i];
			}
		}
		for(int i = 0; i < avg.length; i++) {
			if(max < avg[i]){
				max = avg[i];
			}
		}

		System.out.println("Min Average: " + min );
		System.out.println("Max Average: " +  max +"\n");


		if(min == max) {
			System.out.println("The trials match EXACTLY!");
		}
		else if((tra1/sampSize)==(tra2/sampSize)||(tra1/sampSize)==(tra3/sampSize)||(tra1/sampSize)==(tra4/sampSize)||
				(tra2/sampSize)==(tra3/sampSize)||(tra2/sampSize)==(tra4/sampSize)||(tra3/sampSize)==(tra4/sampSize))
		{
			System.out.println("The trials concur wiht each other!");
		}
		else {
			System.out.println("The trials do NOT concur!");
		}

		input.close();

	}

}
