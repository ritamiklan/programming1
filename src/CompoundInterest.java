import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter initial deposit: ");
		double deposit = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter interest rate: ");
		double interest = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter capital income tax rate: ");
		double taxRate = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter number of years: ");
		int years = Integer.parseInt(input.nextLine());

		double rateMinusTax = interest / 100 * (100 - taxRate) / 100;

		for (int i = 1; i <= years; i++) {

			deposit = deposit + (deposit * rateMinusTax);

			DecimalFormat twoDecimals = new DecimalFormat("0.00");

			System.out.println(i + ": " + twoDecimals.format(deposit).replace(".", ","));

		}
	}
}