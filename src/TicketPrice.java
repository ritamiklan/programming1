import java.util.Scanner;
import java.text.DecimalFormat;


public class TicketPrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter price for a single ticket: ");
		double singleticket = readDouble(input);

		System.out.print("Enter price for a season ticket: ");
		double seasonticket = readDouble(input);
		
		System.out.print("Enter the number of bus trips per month: ");
		int busride = Integer.parseInt(input.nextLine());
		
		double ridesum = singleticket * busride;
		
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		
		if (ridesum < seasonticket) {
			double cheaper = seasonticket - ridesum;
			
			System.out.print("Buying single tickets is " + twoDecimals.format(cheaper) + " euros cheaper.");
		}
		
		else if (ridesum > seasonticket) {
			double more = ridesum - seasonticket;
			
			System.out.print("Buying a season ticket is " + twoDecimals.format(more) + " euros cheaper.");
			
		}
		
		else  {
			System.out.print("There is no difference in the price.");
			
		} 
		
		
	input.close();
		
	}

private static double readDouble(Scanner input) {
		
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
	
}



