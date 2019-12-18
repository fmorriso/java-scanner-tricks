import java.util.Scanner;

public class ScannerTricks
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a whole number: ");
		
		int number = input.nextInt();
		input.nextLine(); // This line you have to add (It consumes the \n character)
		
		System.out.print("Enter some text: ");
		String text1 = input.nextLine();
		
		System.out.print("Enter a double: ");
		double x = input.nextDouble();
		input.nextLine(); // consume \n character left in input buffer
		
		System.out.print("Enter more text: ");
		String text2 = input.nextLine();
		
		input.close();
		input = null;
		
		System.out.printf("number = %d, text1 = %s, x = %.2f, text2 = %s%n", number, text1, x, text2);
	}

}
