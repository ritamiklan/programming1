import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String first = input.nextLine();

		boolean quit = first.equals("quit");

		int length = 0;

		while (quit == false) {

			length += first.length();

			System.out.print("Enter a string: ");
			first = input.nextLine();

			quit = first.equals("quit");

		}

		System.out.print("The total length is " + length);

		input.close();
	}
}
