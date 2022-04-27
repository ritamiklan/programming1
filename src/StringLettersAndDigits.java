import java.util.Scanner;

public class StringLettersAndDigits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = input.nextLine();

		int counterLetters = 0;
		int counterDigits = 0;

		for (int i = 0; i < text.length(); i++) {

			boolean digit = Character.isDigit(text.charAt(i));

			boolean letter = Character.isLetter(text.charAt(i));

			if (digit == true) {

				counterDigits += 1;

			}

			if (letter == true) {

				counterLetters += 1;

			}

		}

		System.out.println(counterLetters + " letter(s)");

		System.out.println(counterDigits + " digit(s)");

		input.close();

	}
}