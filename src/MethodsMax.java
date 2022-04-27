import java.util.Scanner;

public class MethodsMax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first double: ");
		double first = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter second double: ");
		double second = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("The max value is " + max(first, second));

		input.close();

	}

	private static double max(double first, double second) {

		if (first > second) {

			return first;

		} else {

			return second;
		}

	}
}
