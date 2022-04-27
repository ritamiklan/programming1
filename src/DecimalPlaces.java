import java.util.Scanner;
import java.text.DecimalFormat;

public class DecimalPlaces {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal number: ");
		
		double number = readDouble(input);
		
		
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		
		System.out.print(twoDecimals.format(number));
		
		input.close();

	}

	private static double readDouble(Scanner input) {
		
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}