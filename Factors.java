//5. Factors
//a. Desc -> Computes the prime factorization of N using brute force.
//b. I/P -> Number to find the prime factors
//c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
//d. O/P -> Print the prime factors of number N.
package Day_5_Basic_Core_Program;
import java.util.Scanner;
public class Factors 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);//user input
		System.out.print("Enter the number: ");
		int input= sc.nextInt();	
		for(int i=2;i<input;i++)
		{
			if(input % i==0)
			{
				System.out.print(i+" ");
				input=input/i;
			}
		}
		sc.close();
	}
}
