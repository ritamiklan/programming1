import java.util.Scanner;

import java.text.DecimalFormat;

public class ArrayStatistics {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of values: ");
		int numberOfValues = Integer.parseInt(input.nextLine());

		int[] values = new int[numberOfValues];

		String text = "";

		if (numberOfValues < 3) {

			System.out.println("Sorry, at least 3 values required");

		} else {

			for (int i = 0; i < numberOfValues; i++) {

				System.out.print("Enter an integer: ");
				values[i] = Integer.parseInt(input.nextLine());

				text += values[i] + " ";

			}

			int maximum = ArrayStatLibrary.max(values);

			int minimum = ArrayStatLibrary.min(values);

			double medi = ArrayStatLibrary.median(values);

			double average = ArrayStatLibrary.mean(values);

			double dev = ArrayStatLibrary.standardDeviation(values);

			DecimalFormat oneDecimal = new DecimalFormat("0.0");

			System.out.println();
			System.out.println("n = " + numberOfValues);
			System.out.println("Min: " + minimum);
			System.out.println("Max: " + maximum);
			System.out.println("Median: " + oneDecimal.format(medi));
			System.out.println("Mean: " + oneDecimal.format(average));
			System.out.println("Sample standard deviation: " + oneDecimal.format(dev));
			System.out.print("Sample data: " + text);

		}

		input.close();
	}
}