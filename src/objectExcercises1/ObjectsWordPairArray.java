package objectExcercises1;

public class ObjectsWordPairArray {

	public static void main(String[] args) {

		WordPair[] pairArray = {

				new WordPair("class", "luokka"),

				new WordPair("object", "olio"),

				new WordPair("variable", "muuttuja"),

		};

		for (int i = 0; i < pairArray.length; i++) {

			WordPair arrayObject = pairArray[i];

			System.out.println(arrayObject.getEnglishWord() + " = " + arrayObject.getFinnishWord());
		}

	}
}
