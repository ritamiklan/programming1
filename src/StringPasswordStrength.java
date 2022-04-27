import java.util.Scanner;

public class StringPasswordStrength {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter password: ");
		String password = input.nextLine();
		
		
		boolean strength = checkStrength(password);
		
		if (strength == true) {

			System.out.print("OK");

		} else {

			System.out.print("Not strong enough!");
		}
		
		
		
	input.close();	
		
	}

	private static boolean checkStrength(String password) {
		
		
		boolean isItStrong = false;
		
		if (password.matches("[A-Za-z1-9_-]{8,}") == true) {
			
			isItStrong = true;
			
		} else {
			
			isItStrong = false;
		}
		
		
		return isItStrong;
	}
	
}

/*
 A password is considered to be strong enough if it has at least 8 characters 
 and it includes characters from at least three different categories. 
 The four categories of characters are the following: 
 uppercase letters, lowercase letters, digits, and other characters.

*/

