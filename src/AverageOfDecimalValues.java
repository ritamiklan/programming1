import java.util.Scanner;
import java.text.DecimalFormat;

public class AverageOfDecimalValues {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number (zero ends):  ");
		double value1 = Double.parseDouble(input.nextLine().replace(',', '.'));

		double value2 = 0;

		double count = 0;

		if (value1 == 0) {
			System.out.print("Nothing to calculate");

		} else {

			while (value1 > 0 || value1 < 0) {

				value2 += value1;

				count += 1;

				System.out.print("Enter next number (zero ends): ");
				value1 = Double.parseDouble(input.nextLine().replace(',', '.'));

			}

			double average = value2 / count;

			DecimalFormat twoDecimals = new DecimalFormat("0.00");
			System.out.print("The average is " + twoDecimals.format(average));

		}

		input.close();

	}
}
