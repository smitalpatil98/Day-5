//a. Desc -> This program takes a command-line argument N and prints a table of the
//powers of 2 that are less than or equal to 2^N.
//b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
//c. Logic -> repeat until i equals N.
//d. O/P -> Print the year is a Leap Year or not.
package Day_5_Basic_Core_Program;

import java.util.Scanner;

public class Power_of_2 {
	//for int upto 2^30 is allowed if we give input more than that then we get the
	public static double pow2(int num)
	{
		double result=Math.pow(2,num);
		return result;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		if (pow2(num)<=(Integer.MAX_VALUE )){
			System.out.println("2 ^ "+ num + " is "+ (int)pow2(num));
		}
		else 
		{
			System.out.println("Stack is overflow");
		}
	}
}

