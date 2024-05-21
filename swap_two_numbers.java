package Day_5_Basic_Core_Program;

public class swap_two_numbers {

	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		System.out.println("original values of a and b are:-" + a + " & " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("value of a is:-" + a);
		System.out.println("value of b is:-" + b);
	}
}
