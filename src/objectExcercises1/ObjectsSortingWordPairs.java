package objectExcercises1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ObjectsSortingWordPairs {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<WordPair> wordPairList = new ArrayList<WordPair>();

		boolean notQuit = true;

		while (notQuit == true) {

			System.out.print("Enter an English word (quit ends): ");
			String englishWord = input.nextLine();

			if (englishWord.equals("quit")) {

				System.out.println();
				notQuit = false;

			} else {

				System.out.print("Enter a Finnish word: ");
				String finnishWord = input.nextLine();

				wordPairList.add(new WordPair(englishWord, finnishWord));

				System.out.println();
			}
		}

		Collections.sort(wordPairList, new EnglishWordComparator());

		for (WordPair wordPairObject : wordPairList) {

			System.out.println(wordPairObject.getEnglishWord() + " = " + wordPairObject.getFinnishWord());

		}

		System.out.println();

		Collections.sort(wordPairList, new FinnishWordComparator());

		for (WordPair wordPairObject : wordPairList) {

			System.out.println(wordPairObject.getFinnishWord() + " = " + wordPairObject.getEnglishWord());

		}

		input.close();

	}
}
