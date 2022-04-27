package objectExcercises1;

import java.util.Scanner;

public class ObjectsLanguageTranslationArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an English word: ");
		String word = input.nextLine();

		WordPair[] pairArray = {

				new WordPair("bird", "lintu"),

				new WordPair("bus", "bussi"),

				new WordPair("car", "auto"),

				new WordPair("cat", "kissa"),

				new WordPair("dog", "koira"),
		};

		boolean found = false;

		for (int i = 0; i < pairArray.length; i++) {

			WordPair arrayObject = pairArray[i];

			if (arrayObject.getEnglishWord().equals(word)) {

				System.out.println(arrayObject.getFinnishWord());

				found = true;
			}
		}

		if (found == false) {

			System.out.println("Unknown word");
		}

		input.close();
	}

}