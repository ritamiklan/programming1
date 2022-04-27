package objectExcercises1;

public class Word implements Comparable<Word> {
	
	private String word;
	
	public Word(String word) {
		
		this.word = word;
	}

	public String getWord() {
		
		return word;
	}
	
	public int compareTo(Word anotherWord) { 
		
		return word.compareTo(anotherWord.word);
	}

}
