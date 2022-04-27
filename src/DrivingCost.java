import java.util.Scanner;
import java.text.DecimalFormat;

public class DrivingCost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter driven kilometers: ");
		int kms = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter amount of fuel consumed: ");
		double fuel = readDouble(input);
		
		System.out.print("Enter fuel price per liter: ");
		double fuelprice = readDouble(input);
		
		double cost = (fuel * fuelprice) / kms;
		
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		
		System.out.print("The cost per kilometer is " + twoDecimals.format(cost) + " euros.");
		
	}

	private static double readDouble(Scanner input) {
		
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
