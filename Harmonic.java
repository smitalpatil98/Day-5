//4. Harmonic Number
//a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
//b. I/P -> The Harmonic Value N. Ensure N != 0
//c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
//d. O/P -> Print the Nth Harmonic Value.
package Day_5_Basic_Core_Program;

import java.util.Scanner;

public class Harmonic 
{
	public static void main(String[] args) 
	{  
		int sum=0;
		double result = 0.0;
		System.out.println("enter the harmonic number");
		Scanner sc = new Scanner (System.in);
		int number = sc.nextInt();
		if(number<0) 
		{
			System.out.println("enter the valid number");
			return;
		}
		for(int i = number;i>0;i--)
		{
			result = result +(double)1/i;
			System.out.format("harmonic nnumber:%.2f" ,result);
		}
	}
}
