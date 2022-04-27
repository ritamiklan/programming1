import java.util.Random;
import java.util.Arrays;

public class ArrayLottoNumbers {

	public static void main(String[] args) {

		Random randomGenerator = new Random();

		int[] lottoNumbers = new int[7];

		int nextNumber = 0;

		boolean addToArray = false;

		int i = 0;

		while (i < 7) {

			nextNumber = randomGenerator.nextInt(39) + 1;

			addToArray = true;

			for (int x = 0; x < lottoNumbers.length; x++) {

				if (lottoNumbers[x] == nextNumber) {

					addToArray = false;
				}
			}

			if (addToArray == true) {

				lottoNumbers[i] = nextNumber;

				i++;

			}
		}

		Arrays.sort(lottoNumbers);

		System.out.println(Arrays.toString(lottoNumbers));

	}
}
