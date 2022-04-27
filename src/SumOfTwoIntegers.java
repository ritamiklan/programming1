import java.util.Scanner;

public class SumOfTwoIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int firstInteger = Integer.parseInt(input.nextLine());

		System.out.print("Enter second integer: ");
		int secondInteger = Integer.parseInt(input.nextLine());

		int sum = firstInteger + secondInteger;

		System.out.print(firstInteger + " + " + secondInteger + " = " + sum);

		input.close();

	}
}
