import java.util.Arrays;
import java.util.Scanner;

public class ArrayDistinctValues {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of values: ");
		int nrValues = Integer.parseInt(input.nextLine());

		int[] values = new int[nrValues];

		for (int i = 0; i < values.length; i++) {

			System.out.print("Enter an integer: ");
			values[i] = Integer.parseInt(input.nextLine());

		}

		Arrays.sort(values);
		
		int y = 0;

		int initial = values[y];
		
		String text = initial + " ";

		for (y = 1; y < values.length; y++) {

			if (initial != values[y]) {

				text += values[y] + " ";

				initial = values[y];

			}
		}

		System.out.print(text);

		input.close();
	}
}