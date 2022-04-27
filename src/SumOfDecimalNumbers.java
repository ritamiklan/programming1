import java.util.Scanner;
import java.math.BigDecimal;

public class SumOfDecimalNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		BigDecimal x = new BigDecimal(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter second number: ");
		BigDecimal y = new BigDecimal(input.nextLine().replace(',', '.'));
		
		BigDecimal sum = x.add(y); 
		
		
		System.out.print(sum);
		
		input.close();
		
	}
}
