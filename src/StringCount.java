import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");

		String firstOne = input.nextLine();

		int number = 0;

		while (firstOne.length() > 0) {

			number += 1;

			System.out.print("Enter a string: ");
			firstOne = input.nextLine();
		}

		System.out.print(number + " strings");
		input.close();

	}
}
