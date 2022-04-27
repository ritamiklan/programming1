import java.util.Scanner;

public class MethodsSecond {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter width: ");
		int width = Integer.parseInt(input.nextLine());

		System.out.print("Enter height: ");
		int height = Integer.parseInt(input.nextLine());
		
		System.out.println();

		printRectangle(width, height);

	}

	private static void printRectangle(int width, int height) {

		String text = "";

		for (int i = 0; i < width; i++) {

			text += "x";
		}

		for (int i = 0; i < height; i++) {

			System.out.println(text);

		}
	}
}
