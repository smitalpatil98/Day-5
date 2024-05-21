//Leap Year :-
//a. I/P -> Year, ensure it is a 4 digit number.
//b. Logic -> Determine if it is a Leap Year.
//c. O/P -> Print the year is a Leap Year or not.
package Day_5_Basic_Core_Program;

import java.util.Scanner;

public class Leap_Year 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year 4 digit: ");
		int year = sc.nextInt();
		if(isValidYear(year)) 
		{
			if((year%4==0 && year%100!=0)|| (year%400==0))
			{
				System.out.println(year+" is a leap year");
			}
			else
			{
				System.out.println(year+" invalid input please menter a 4 digit number");
			}
		}
	}
	public static boolean isValidYear(int year)
	{
		return String.valueOf(year).length()==4;
	}
	//Sure, I'll add input validation to ensure that the entered year has exactly four digits. Here's the updated code:
	//Now, before checking if the year is a leap year, 
	//it verifies that the entered year is a four-digit number using the `isValidYear` method. 
	//If the year has exactly four digits, it proceeds to check if it's a leap year; 
	//otherwise, it prints an error message indicating that the input is invalid.
}
