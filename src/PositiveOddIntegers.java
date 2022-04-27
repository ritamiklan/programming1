import java.util.Scanner;

public class PositiveOddIntegers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean done = false;

		while (done == false) {

			System.out.print("Enter a positive odd integer: ");
			String text = input.nextLine();

			boolean quit = text.equals("quit");

			if (quit == false) {

				try {
					int number = Integer.parseInt(text);
					if (number % 2 == 0 || number < 0) {

						System.out.println("  " + number + " is not a positive odd integer\n");


					} else {

						System.out.print("  OK\n\n");

					}

				} catch (NumberFormatException fne) {
					System.out.println("  '" + text + "' is not a positive odd integer\n");
				}

			} else {
				System.out.println("  Bye!");
				done = true;
			}

		}

		input.close();
	}
}
