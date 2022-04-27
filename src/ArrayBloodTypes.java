import java.util.Scanner;
import java.text.DecimalFormat;

public class ArrayBloodTypes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] bloodTypes = { "A+", "O-", "AB+", "O+", "AB+", "AB+", "O-", "AB+", "O+", "AB+" };

		System.out.print("Enter blood type: ");
		String userBlood = input.nextLine();

		int count = 0;

		for (int i = 0; i < bloodTypes.length; i++) {
			if (bloodTypes[i].equals(userBlood)) {

				count++;
			}
		}

		DecimalFormat oneDecimal = new DecimalFormat("0.0".replace(',', '.'));

		double percentage = (bloodTypes.length / 100.0) * (count * 100);

		System.out.println(oneDecimal.format(percentage) + " %");

		input.close();

	}
}
