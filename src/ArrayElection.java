import java.util.Scanner;

public class ArrayElection {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of candidates: ");
		int nrOfCandidate = Integer.parseInt(input.nextLine());

		String[] candidates = new String[nrOfCandidate];
		int[] votes = new int[nrOfCandidate];

		for (int i = 0; i < nrOfCandidate; i++) {

			System.out.print("Enter " + (i + 1) + ". name: ");
			candidates[i] = input.nextLine();

			System.out.print("Enter votes: ");
			votes[i] = Integer.parseInt(input.nextLine());

		}

		int maxValue = 0;

		for (int x = 0; x < votes.length; x++) {

			if (votes[x] > maxValue) {

				maxValue = votes[x];

			}
		}

		int[] indexOf = new int[nrOfCandidate];

		int count = 0;

		for (int y = 0; y < votes.length; y++) {

			if (maxValue == votes[y]) {

				indexOf[count] = y;

				count++;

			}
		}

		String tieText = "";

		if (count == 1) {

			System.out.print("The winner is " + candidates[indexOf[0]] + " with " + maxValue + " votes!");

		} else {

			for (int z = 0; z < count; z++) {

				tieText += candidates[indexOf[z]] + "(" + maxValue + " votes) \n";

			}

			System.out.print("The election is a tie between the following candidates: \n" + tieText);
		}

		input.close();
	}
}