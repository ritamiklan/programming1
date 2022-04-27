import java.util.Arrays;
import java.util.Scanner;

public class ArrayDescendingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] decimals = new double[4];
		int nr = 1;

		for (int i = 0; i < decimals.length; i++) {

			System.out.print("Enter " + nr + ". number: ");
			decimals[i] = Double.parseDouble(input.nextLine().replace(',', '.'));

			nr++;

		}

		Arrays.sort(decimals);

		for (int i = decimals.length - 1; i >= 0; i--) {

			System.out.print(decimals[i] + " ");
		}

		input.close();

	}
}
