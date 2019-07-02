import java.util.Scanner;

public class InvalidRegularExpressions {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String regex = "[A-Z][a-z]{1,30}";
		
		
		getValidName(scnr);
		getValidEmail(scnr);
		getValidPhoneNum(scnr);
		getValidBirthDate(scnr);
		
		
		
		}
	
	
	
	private static String getValidName(Scanner scnr) {
		boolean isValid = false;
		String input;
		do {
			System.out.println("You look like a bill. But that's not your name, now is it. Do share...");
			input = scnr.nextLine();
			
			if (input.matches("[A-Z][a-z]{1,30}")) {
				System.out.println("Cool.. I'm gonna call you bill.");
				isValid = true;
			} else {
				System.out.println("Wrong bruh");
				isValid = false;
			}
			
		} while (!isValid);
		return input;
	}
	
	
	
	private static String getValidEmail(Scanner scnr) {
		boolean isValid = false;
		String input;
		do {
			System.out.println("Hey! Would you like to support my fundraiser for canolis at GrandCircus? Enter your email if yous downs with it.");
			input = scnr.nextLine();
			
			if (input.matches("[0-9a-z@.]+")) {
				System.out.println("The canolis appreciate you");
				isValid = true;
			} else {
				System.out.println("Wrong again");
				isValid = false;
			}
			
		} while (!isValid);
		return input;
	}
	
	
	private static String getValidPhoneNum(Scanner scnr) {
		boolean isValid = false;
		String input;
		do {
			System.out.println("The back of yo head is redonkulus. How bout dem digits.. eh?");
			input = scnr.nextLine();
			
			if (input.matches("[(0-9)-]+")) {
				System.out.println("I don't know. You sure there isn't a double 3..");
				isValid = true;
			} else {
				System.out.println("Why you always lyin doe?!");
				isValid = false;
			}
			
		} while (!isValid);
		return input;
	}
	
	
	private static String getValidBirthDate(Scanner scnr) {
		boolean isValid = false;
		String input;
		do {
			System.out.println("Ay yo Bill! When's your birth date? (Enter as MM/DD/YY)");
			input = scnr.nextLine();
			
			if (input.matches("[(0-9)-]+")) {
				System.out.println("hmmmmmmmmm");
				isValid = true;
			} else {
				System.out.println("My momma was right about Bills... Always lyin \\uD83D\\uDE44");
				isValid = false;
			}
			
		} while (!isValid);
		return input;
		

	}
}
