import java.util.Scanner;

public class ValidateFirst {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter grade (0-5): ");
			int grade = Integer.parseInt(input.nextLine());

			System.out.print("OK");

		} catch (NumberFormatException nfe) {

			System.out.println("Please enter an integer.");
		}

		input.close();
	}
}
