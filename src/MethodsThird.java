import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodsThird {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter gross salary: ");
		double gross = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter income tax rate: ");
		double taxRate = Double.parseDouble(input.nextLine().replace(',', '.'));
		

		System.out.println("The net salary is " + calculateNetSalary(gross, taxRate));

		input.close();

	}

	private static String calculateNetSalary(double gross, double taxRate) {

		double netSalary = gross - (gross * taxRate / 100);
		
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		return twoDecimals.format(netSalary);
	}

}