//Java Program to Check Whether an Alphabet is Vowel or Consonant
package Day_5_Basic_Core_Program;
import java.util.Scanner;
class Vowel_Consonant 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character");
		char ch = sc.next().charAt(0);
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Vowel");
			break;
		default:
			System.out.print("Consonent");	

		}
	}
}
