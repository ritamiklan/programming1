package objectExcercises1;

import java.util.Scanner;
import java.util.ArrayList;

public class ObjectsLanguageTranslationArrayList {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");

		ArrayList<WordPair> wordPairList = new ArrayList<WordPair>();

		boolean notOk = true;

		while (notOk == true) {

			System.out.print("Enter an English word: ");
			String englishWord = input.nextLine();

			if (englishWord.equals("ok")) {

				notOk = false;

			} else {

				System.out.print("Enter a Finnish word: ");
				String finnishWord = input.nextLine();

				wordPairList.add(new WordPair(englishWord, finnishWord));

				System.out.println();
			}

		}

		System.out.println();

		System.out.println("=== English-Finnish translation service (quit ends) ===");

		boolean quit = false;

		boolean found = false;

		while (quit == false) {

			System.out.print("Enter an English word: ");
			String translateThis = input.nextLine();

			if (translateThis.equals("quit")) {

				System.out.println("Bye!");

				quit = true;

			} else {

				found = false;

				for (WordPair wordPairObject : wordPairList) {

					if (translateThis.equals(wordPairObject.getEnglishWord())) {

						System.out.println(wordPairObject.getFinnishWord());

						System.out.println();

						found = true;

					}
				}

				if (quit == false && found == false) {

					System.out.println("Unknown word");

					System.out.println();

				}
			}
		}

		input.close();
	}
}
