package objectExcercises1;

import java.util.Comparator;

public class FinnishWordComparator implements Comparator<WordPair> {

	public int compare(WordPair a, WordPair b) {

		return a.getFinnishWord().compareTo(b.getFinnishWord());

	}
}
