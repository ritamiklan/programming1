import java.util.Scanner;
import java.text.DecimalFormat;

public class ArrayGrossPayCalculation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your hourly wage: ");
		double hourly = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter the number of days: ");
		int days = Integer.parseInt(input.nextLine());

		int[] dailyHours = new int[days];

		int totalHours = 0;

		double grossPay = 0;
		
		String enteredHours = "";

		for (int i = 0; i < days; i++) {

			System.out.print("Hours worked on day " + (i+1) + ": ");
			dailyHours[i] = Integer.parseInt(input.nextLine());

			totalHours += dailyHours[i];
			
			enteredHours += dailyHours[i] + " ";

			int overTimeHours = 0;

			if (dailyHours[i] > 8) {
				overTimeHours = dailyHours[i] - 8;

				double overTimePay = overTimeHours * (hourly * 0.5);

				double dailyWage = (dailyHours[i] * hourly) + overTimePay;
				
				grossPay += dailyWage;

			} else {

				grossPay += dailyHours[i] * hourly;

			}

		}
		
		DecimalFormat twoDecimals = new DecimalFormat("0.00".replace(',', '.'));
		
		System.out.println("Total work hours is " + totalHours);
		
		System.out.println("Gross pay is " + twoDecimals.format(grossPay));
		
		System.out.println("You entered the following daily hours: " + enteredHours);
		
		input.close();
	}
}