import java.util.Scanner;

public class MailingAddress {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Please enter your name");
		String name = keyboard.nextLine();
		
		System.out.println("Thank you, now let's enter your street name");
		String street = keyboard.nextLine();
		System.out.println("What is your street number?");
				String number = keyboard.nextLine();
		System.out.println("Now lets enter your city and state abbreviation");
				String city = keyboard.nextLine();
		System.out.println("Lets enter the zip code");
			int zip = keyboard.nextInt();
			
		System.out.println(name + "\n" + number+street + "\n" + zip + city);
		
		
	}
	
}
