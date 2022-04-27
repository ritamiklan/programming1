import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		try {
			
		System.out.print("Enter a non-negative integer: ");
		int x = Integer.parseInt(input.nextLine());
		 
		if (x < 0) {
			
			throw new NumberFormatException();
		
		} else {

		int factorial = 1;

		for (int i = 1; i <= x; i++) {

			factorial *= i;
			}

		System.out.print(x + "! = " + factorial);
		}
		
		} catch (NumberFormatException nfe) {
			
			System.out.print("Please enter a non-negative integer.");
			
		}
		
		input.close();

	}
}
