package objectExcercises1;

import java.util.Scanner;

public class ObjectsApplicantProgram {

	public static void main(String[] args) {

		Applicant[] applicantArray = new Applicant[4];

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < applicantArray.length; i++) {

			System.out.print("Enter " + (i + 1) + ". name: ");
			String name = input.nextLine();

			System.out.print("Enter points: ");
			int points = Integer.parseInt(input.nextLine());

			applicantArray[i] = new Applicant(name, points);

		}

		System.out.print("Enter the minimum of required points: ");
		int minimumPoints = Integer.parseInt(input.nextLine());

		String text = "";

		for (int y = 0; y < applicantArray.length; y++) {

			if (applicantArray[y].getPoints() >= minimumPoints) {

				text += applicantArray[y].getName() + ", " + applicantArray[y].getPoints() + " points \n";

			}
		}

		System.out.print("The following applicants achived the minimum of " + minimumPoints + " points:\n" + text);

		input.close();

	}
}