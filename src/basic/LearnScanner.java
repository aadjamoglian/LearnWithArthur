package basic;

import java.util.Scanner;

public class LearnScanner {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your name please.");
		String firstName = in.nextLine();
		
		System.out.println("Your first name is " + firstName);
		
		System.out.println("Enter your last name please.");
		String lastName = in.nextLine();
		
		System.out.println("Your last name  is ");
		
		System.out.println("Your full name is " + firstName + " " + lastName);
		
		System.out.println("Enter your lucky number");
		int luckyNumber = in.nextInt();
		
		System.out.println("Your lucky number is " + luckyNumber);
		
		in.close();

	}

}
