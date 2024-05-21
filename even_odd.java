//Java Program to Check Whether a Number is Even or Odd
package Day_5_Basic_Core_Program;

import java.util.Scanner;

public class even_odd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check whether it is even or odd ");
		int n = sc.nextInt();

		if(n%2==0)
		{
			System.out.println("It is an even number");
		}
		else
		{
			System.out.println("Not an even number");
		}
	}
}

