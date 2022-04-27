import java.util.Scanner;

public class MethodsFactorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int x = Integer.parseInt(input.nextLine());

		for (int i = 1; i <= x; i++) {

			System.out.println(i + "! = " + factorial(i));
			
		}
		
		input.close();
	}

	private static int factorial(int number) {


		int factorial = 1;

		for (int i = 1; i <= number; i++) {

			factorial *= i;

		}

		return factorial;
	}
}
