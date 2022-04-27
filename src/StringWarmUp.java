import java.util.Scanner;

public class StringWarmUp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = input.nextLine();

		int length = text.length();

		String lowerCase = text.toLowerCase();
		String upperCase = text.toUpperCase();

		System.out.println(length + " characters");
		System.out.println(upperCase);
		System.out.println(lowerCase);

		input.close();

	}
}
