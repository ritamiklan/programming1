import java.util.Scanner;

public class MethodsPrimes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("How many primes: ");
		int number = Integer.parseInt(input.nextLine());

		String listOfPrimes = "";

		int primeCount = 0;

		int i = 2;

		while (primeCount < number) {

			boolean isPrimeNumber = isPrime(i);

			if (isPrimeNumber == true) {

				listOfPrimes += i + " ";

				primeCount++;
			}

			i++;

		}

		System.out.print(listOfPrimes);
		
		input.close();

	}

	private static boolean isPrime(int a) {

		for (int i = 2; i < a; i++) {

			if (a % i == 0) {

				return false;
			}
		}

		return true;

	}
}
