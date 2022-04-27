import java.util.Scanner;
import java.text.DecimalFormat;


public class DiscountPrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter original price: ");
		double price = readDouble(input);
		
		System.out.print("Enter discount percentage: ");
		double percentage = readDouble(input);
		
		double finalprice = price - (price * (percentage / 100));
		
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
			
		System.out.print("The final price is " + twoDecimals.format(finalprice));
		
		input.close();
		
	}

	private static double readDouble(Scanner input) {
		
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
