import java.time.LocalDate;
import java.util.Scanner;

public class MethodsPrintCalendar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: ");
		int year = Integer.parseInt(input.nextLine());

		System.out.print("Enter month: ");
		int month = Integer.parseInt(input.nextLine());
		

		System.out.println();
		printCalendar(year, month);
		System.out.println();
		
		input.close();
	}

	private static void printCalendar(int year, int month) {

		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		LocalDate myDate = LocalDate.of(year, month, 1);

		int daysInMonth = myDate.lengthOfMonth();

		int dayOfWeek = myDate.getDayOfWeek().getValue();

		String whichMonth = monthName[month - 1];

		System.out.println(" > " + whichMonth + " " + year + " <");
		System.out.println(" Mon Tue Wed Thu Fri Sat Sun");

		for (int i = 1; i < dayOfWeek; i++) {

			System.out.print("    ");

		}

		int dayCount = 7 - dayOfWeek + 1;

		for (int x = 1; x <= dayCount; x++) {

			System.out.printf("%4d", x);

		}

		System.out.println();

		int leftover = daysInMonth - dayCount;

		int startValue = dayCount + 1;

		for (int y = 0; y < leftover; y++) {

			System.out.printf("%4d", y + startValue);

			if (y % 7 == 6) {
				System.out.println();
			}
		}

	}
}