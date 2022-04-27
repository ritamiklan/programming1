import java.util.Scanner;

public class StringPassword {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter username: ");
		String username = input.nextLine();

		System.out.print("Enter password: ");
		String password = input.nextLine();

		boolean formatOk = validatePassword(username, password);

		if (formatOk == true) {

			System.out.print("OK");

		} else {

			System.out.print("NOT OK");
		}

		input.close();

	}

	private static boolean validatePassword(String username, String password) {
		
		String lowerUn = username.toLowerCase();
		String lowerPw = password.toLowerCase();

		if (lowerPw.length() >= 8 && lowerPw.indexOf(lowerUn) == -1) {

			return true;

		} else {
			return false;
		}

	}
}
