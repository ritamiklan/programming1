import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		String text = input.nextLine();

		int charCount = text.length();

		int number = Integer.parseInt(text);

		if (number < 0) {
			number = -number;
			charCount -= 1;
		}
			
		
		int product = 1;

		for (int i = 1; i <= charCount; i++) {

			int value = number % 10;

			product *= value;

			number = number / 10;

		}

		System.out.println(product);
		
		input.close();

	}
}
