
public class ArrayMatrixSum {

	public static void main(String[] args) {

		int[][] first = { { 1, 2, 0 }, { 2, 3, 4 } };
		int[][] second = { { 3, 2, 5 }, { 6, 4, 3 } };
		int[][] third = { { 1, 1, 1, 1 }, { 4, 3, 2, 1 }, { 2, 2, 2, 2 } };
		int[][] fourth = { { 2, 2, 2, 3 }, { 2, 3, 2, 0 }, { 1, 2, 3, 4 } };

		printSum(first, second);
		System.out.println();

		printSum(third, fourth);

	}

	private static int[][] printSum(int[][] one, int[][] two) {

		int numberOfRows = one.length;
		int numberOfColumns = one[0].length;

		int[][] sum = new int[numberOfRows][numberOfColumns];

		int i = 0;
		int y = 0;

		for (y = 0; y < numberOfRows; y++) {

			for (i = 0; i < numberOfColumns; i++) {

				sum[y][i] = one[y][i] + two[y][i];
				
				System.out.print(sum[y][i] + " ");
				
			}
			
			System.out.println();
		}

		return sum;

	}
}


/*
 * 
 * We can get the number of rows in a two-dimensional array as follows:
 * System.out.println(first.length); // Prints 2 
 * We can get the number of columns in a two-dimensional array as follows:
 * System.out.println(first[0].length); // Prints 3
 * 
 */

// 00 + 00, 01+01, 02+02, 03+03...
// 10 + 10, 11+11, 12+12, 13+13...
