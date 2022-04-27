package objectExcercises1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ObjectsWordList {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<Word> wordList = new ArrayList<Word>();

		boolean notQuit = true;

		while (notQuit == true) {

			System.out.print("Enter a word (quit ends): ");
			String nextWord = input.nextLine();

			if (nextWord.equals("quit")) {
				notQuit = false;
				
			} else {
				wordList.add(new Word(nextWord));
			}

		}

		Collections.sort(wordList);

		for (Word wordObject : wordList) {

			System.out.println(wordObject.getWord());
		}

		input.close();
	}
}
