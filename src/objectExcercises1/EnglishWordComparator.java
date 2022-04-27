package objectExcercises1;

import java.util.Comparator;

public class EnglishWordComparator implements Comparator<WordPair> {

	public int compare(WordPair a, WordPair b) {

		return a.getEnglishWord().compareTo(b.getEnglishWord());

	}
}
