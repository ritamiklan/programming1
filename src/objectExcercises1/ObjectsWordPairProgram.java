package objectExcercises1;

public class ObjectsWordPairProgram {
	
	public static void main(String[] args) {
		
		WordPair one = new WordPair("class", "luokka");
		
		WordPair two = new WordPair("object", "olio");
		
		WordPair three = new WordPair("variable", "muuttuja");
		

		System.out.println(one.getEnglishWord() + " = " + one.getFinnishWord());
		System.out.println(two.getEnglishWord() + " = " + two.getFinnishWord());
		System.out.println(three.getEnglishWord() + " = " + three.getFinnishWord());
		
	}
}




/*
class = luokka
object = olio
variable = muuttuja
*/