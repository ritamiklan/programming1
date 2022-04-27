import java.util.Scanner;

public class StringCreateUsername {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first name: ");
		String firstName = input.nextLine();

		System.out.print("Enter surname: ");
		String surname = input.nextLine();

		String username = createUsername(firstName, surname);

		if (username == null) {

			System.out.println("Not enough letters to create a username!");

		} else {

			System.out.println(username);
		}

		input.close();

	}

	private static String createUsername(String name1, String name2) {

		if (name1.length() < 2 || name2.length() < 3) {

			return null;

		} else {

			String lowerFirstName = name1.toLowerCase().substring(0, 2);
			String lowerSurname = name2.toLowerCase().substring(0, 3);

			String username = lowerSurname + lowerFirstName;

			return username;

		}

	}
}
