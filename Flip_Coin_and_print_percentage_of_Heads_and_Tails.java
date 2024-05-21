//Flip Coin and print percentage of Heads and Tails
//a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
//b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
//heads
//c. O/P -> Percentage of Head vs Tails

package Day_5_Basic_Core_Program;

import java.util.Scanner;

public class Flip_Coin_and_print_percentage_of_Heads_and_Tails {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of times to flip the coin: ");
		int numFlips = scanner.nextInt();

		if (numFlips <= 0) {
			System.out.println("Number of flips should be a positive integer.");
			return;
		}

		int heads = 0;
		int tails = 0;

		for (int i = 0; i < numFlips; i++) {
			double randomValue = Math.random(); // Random value between 0 and 1
			if (randomValue < 0.5) {
				tails++;
			} else {
				heads++;
			}
		}
		double headPercentage = (heads * 100.0) / numFlips;
		double tailPercentage = (tails * 100.0) / numFlips;

		System.out.println("Percentage of heads: " + headPercentage);
		System.out.println("Percentage of tails: " + tailPercentage);

		scanner.close();
	}
}