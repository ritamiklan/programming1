import java.util.Scanner;
import java.lang.Character;

public class StringRemoveSpace {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String userText = input.nextLine();

		String trimmed = removeExtraSpace(userText);

		System.out.println("\"" + trimmed + "\"");

		input.close();
	}

	private static String removeExtraSpace(String text) {

		String trimmedText = text.trim();

		String newText = "";

		int i = 0;

		boolean prevCharWhitespace = false;

		for (i = 0; i < trimmedText.length(); i++) {

			boolean addCurrentChar = false;

			if (prevCharWhitespace == true && Character.isWhitespace(trimmedText.charAt(i)) == true) {

				addCurrentChar = false;

			} else {

				addCurrentChar = true;
			}

			if (addCurrentChar == true) {

				newText += trimmedText.charAt(i);
			}

			prevCharWhitespace = Character.isWhitespace(trimmedText.charAt(i));

		}

		return newText;
	}

}