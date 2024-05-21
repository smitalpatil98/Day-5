package Day_5_Basic_Core_Program;

import java.util.Scanner;

public class quotient_remainder {

	public static void main(String[] args)
	//hard code:-
	//	{
	//		int n = 50;
	//		int d = n%10;
	//		int num =n/10;
	//		System.out.println(d);
	//		System.out.println(num);

	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num=sc.nextInt();
		System.out.println("The Quotient of "+num+" is "+(num/10));
		System.out.print("The Remainder of "+num+" is "+(num%10));

	}

}

