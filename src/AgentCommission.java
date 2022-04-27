import java.util.Scanner;
import java.text.DecimalFormat;


public class AgentCommission {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter selling price: ");
		double price = readDouble(input);
		
		
		double commission = price * (3.44 / 100);
		
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		
		if (commission <= 2400.00) {
			System.out.print("The commission is 2400,00 euros.");
		}
		
		else {
			System.out.print("The commission is " + twoDecimals.format(commission) + " euros.");
		}
		
	}
	
	private static double readDouble(Scanner input) {
		
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
