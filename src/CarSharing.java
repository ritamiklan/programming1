import java.util.Scanner;
import java.text.DecimalFormat;


public class CarSharing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter driven kilometers: ");
		int kms = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter fuel consumption per 100 km: ");
		double fuelConsumption = readDouble(input);
		
		System.out.print("Enter fuel price per liter: ");
		double pricePerLiter = readDouble(input);
		
		System.out.print("Enter number of people: ");
		int ppl = Integer.parseInt(input.nextLine());
		
		double pricePerPerson = ((kms / 100) * fuelConsumption * pricePerLiter ) / ppl;
		
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		
		System.out.print("Each of the " + ppl + " people should pay " + twoDecimals.format(pricePerPerson) + " euros.");
		
		input.close();

	}
	
private static double readDouble(Scanner input) {
	
	return Double.parseDouble(input.nextLine().replace(',', '.'));
}


}
