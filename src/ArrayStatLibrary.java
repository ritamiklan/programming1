import java.util.Arrays;

import java.lang.Math;

public class ArrayStatLibrary {

	public static int max(int[] arrayNumbers) {

		int maxValue = 0;

		for (int i = 0; i < arrayNumbers.length; i++) {

			if (arrayNumbers[i] > maxValue) {

				maxValue = arrayNumbers[i];
			}

		}
		return maxValue;
	}

	public static int min(int[] arrayNumbers) {

		int minValue = arrayNumbers[0];

		for (int i = 1; i < arrayNumbers.length; i++) {

			if (arrayNumbers[i] < minValue) {

				minValue = arrayNumbers[i];
			}
		}

		return minValue;

	}

	public static double median(int[] arrayNumbers) {

		double medianValue = 0;

		Arrays.sort(arrayNumbers);

		if (arrayNumbers.length % 2 == 0) {

			int indexOne = arrayNumbers.length / 2;
			int indexTwo = indexOne - 1;

			medianValue = (arrayNumbers[indexOne] + arrayNumbers[indexTwo]) / 2.0;

		} else {

			int index = arrayNumbers.length / 2;

			medianValue = arrayNumbers[index];

		}

		return medianValue;
	}

	public static double mean(int[] arrayNumbers) {

		double meanValue = 0;

		int sum = 0;

		for (int i = 0; i < arrayNumbers.length; i++) {

			sum += arrayNumbers[i];

		}

		meanValue = sum;

		meanValue = meanValue / arrayNumbers.length;

		return meanValue;

	}

	public static double standardDeviation(int[] arrayNumbers) {

		double deviation = 0;

		double sampleMean = mean(arrayNumbers);

		double squaredDifferences = 0;

		for (int i = 0; i < arrayNumbers.length; i++) {

			double firstStep = (arrayNumbers[i] - sampleMean) * (arrayNumbers[i] - sampleMean);

			squaredDifferences += firstStep;

		}

		double thirdStep = squaredDifferences / (arrayNumbers.length - 1);

		deviation = Math.sqrt(thirdStep);

		return deviation;
	}
}
