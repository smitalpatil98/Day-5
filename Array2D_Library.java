//2D Array
//a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
//standard input and printing them out to standard output.
//b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
//c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
//d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
//OutputStreamWriter to print the output to the screen.
package Day_5_Basic_Core_Program;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Array2D_Library 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows(M): ");
		int rows = sc.nextInt();

		System.out.println("Enter the number of columns(N): ");
		int cols = sc.nextInt();

		//Create 2D	array
		int[][]array = new int[rows][cols];

		//Read inputs
		System.out.println("Enter the elements of the 2D array:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++) 
			{
				array[i][j]= sc.nextInt();

			}
		}
		//Print the 2D array
		print2DArray(array);

		//Close the scanner 
		sc.close();  
	}
	private static void print2DArray(int[][] array) 
	{
		//PrintWriter with OutputStreamWriter to print the output
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
		writer.println("2D ARRAY:");
		for(int[]row: array) 
		{
			for(int num:row) 
			{
				writer.print(num+ " ");
			}
			writer.println();
		}
		writer.flush();
	}
}
//PseudoCode 
//1. Create a class named Array2DLibrary
//2. Define a main function inside the class
//3. Prompt the user to enter the number of rows (M) and columns (N)
//4. Create a 2D array with dimensions M x N
//5. Use nested loops to read M * N inputs from the user and populate the array
//6. Define a print function to print the 2D array
//7. Use PrintWriter with OutputStreamWriter to print the array
//8. Call the print function to print the array

//Algorithm
//1. Start
//2. Define a class Array2DLibrary
//3. Inside the class, define a main function:
//    a. Prompt the user to enter the number of rows (M) and columns (N)
//    b. Read the input values for M and N
//    c. Create a 2D array with dimensions M x N
//    d. Use nested loops to iterate over the rows and columns of the array:
//        i. Prompt the user to enter the element for each cell of the array
//        ii. Read the input value and store it in the corresponding cell
//    e. Define a print function:
//        i. Initialize PrintWriter with OutputStreamWriter to print the output
//        ii. Print the 2D array by iterating over its elements and using PrintWriter to print each element
//        iii. Flush the PrintWriter to ensure all data is written to the output stream
//    f. Call the print function to print the array
//4. End