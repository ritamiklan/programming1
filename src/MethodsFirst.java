
public class MethodsFirst {

	public static void main(String[] args) {

		printNumbers();

	}

	private static void printNumbers() {

		String text = "";

		int i = 0;

		while (i < 50) {

			i += 2;

			text += i + " ";

		}

		System.out.print(text);

	}
}
