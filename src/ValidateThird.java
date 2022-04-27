import java.util.Scanner;

public class ValidateThird {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean done = false;

		while (done == false) { // while it is not done, it will circle back here

			System.out.print("Enter grade (0-5): ");
			String text = input.nextLine();

			try {
				int grade = Integer.parseInt(text);
				if (grade > 5 || grade < 0) {

					throw new NumberFormatException();

				} else {

					System.out.print("OK");
					done = true;  // exit from while loop
				}

			} catch (NumberFormatException fne) {
				System.out.print(text + " is not a valid grade. \n ");
			}
		}
	}
}
