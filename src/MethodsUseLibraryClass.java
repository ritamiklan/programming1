import java.util.Scanner;

public class MethodsUseLibraryClass {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = Integer.parseInt(input.nextLine());

		int factorial = MethodsLibrary.calculateFactorial(number);

		System.out.print(number + "! = " + factorial);

		input.close();

	}

}
