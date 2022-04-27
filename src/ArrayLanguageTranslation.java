import java.util.Scanner;

public class ArrayLanguageTranslation {

	public static void main(String[] args) {

		String[] english = { "bird", "bus", "car", "cat", "dog", "school", "thanks", "train", "teacher" };
		String[] finnish = { "lintu", "bussi", "auto", "kissa", "koira", "koulu", "kiitos", "juna", "opettaja" };

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an English word: ");
		String word = input.nextLine();

		int index = 0;

		boolean found = false;

		for (int i = 0; i < english.length; i++) {

			if (english[i].equals(word)) {

				index = i;
				found = true;

			}

		}

			if (found == true) {
	
				System.out.print(finnish[index]);
				
			} else {
				
				System.out.print("Unknown word");
			}
			
		input.close();	
	}
}
