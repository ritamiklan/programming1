import java.util.Scanner;

public class StringBackwards {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");

		String text = input.nextLine();

		System.out.println(reverse(text));

		input.close();

	}

	private static String reverse(String text) {

		String reverse = "";

		for (int i = text.length() - 1; i >= 0; i--) {

			reverse += text.charAt(i);

		}

		return reverse;

	}
}