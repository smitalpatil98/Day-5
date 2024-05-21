package Day_5_Basic_Core_Program;

public class largest_among_3 
{
	public static void main(String[] args) 
	{

		int num1=10;
		int num2=20;
		int num3=30;

		int largest = num1;

		if(num2 > largest)
		{
			largest = num2;
		}
		if(num3 >largest)
		{
			largest = num3;
		}
		System.out.println("The largest number is:- "+largest);
	}
}
