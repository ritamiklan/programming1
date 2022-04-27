import java.util.Scanner;

public class DescendingIntegers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int a = Integer.parseInt(input.nextLine());
		
		
		for (int i = a; a >= 1; a--) {
		      System.out.print(a + " ");
		    }  
		
		input.close();

	}

}
