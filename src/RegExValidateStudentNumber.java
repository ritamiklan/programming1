import java.util.Scanner;

public class RegExValidateStudentNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter student number: ");
		String studentNr = input.nextLine();

		if (studentNr.matches("[0-9]{7}") == true) {
			System.out.print("OK");

		} else {

			System.out.print("Invalid student number");
		}

		input.close();

	}
}
