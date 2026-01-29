package helloProj;

import java.util.Scanner;

public class greets {

	public static void main(String[] args) {

		System.out.println("What is your name? ");
		Scanner person = new Scanner(System.in);
		String name = person.nextLine();
		System.out.println("Hello" + " " + name.toUpperCase());

		/*
		 * System.out.println("Hello There!"); Scanner client = new Scanner(System.in);
		 * String info = client.nextLine(); System.out.println("Hello " +
		 * info.toUpperCase());
		 */

		String vault = "I love my family";
		String password = "Let me in";
		System.out.println("Guess the password: ");

		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		System.out.println(password.equals(guess));

		int number;
		number = 1;

		while (number < 6) {

			System.out.println(number);

			number = number + 1;
		}
		System.out.println("Done");

		int years;
		double rate;
		double interest;
		double principal;

		years = 5;
		rate = 3.375;
		interest = 0.07;
		principal = 15000;

		for (years = 0; years < 5; years++) {

			interest = principal * rate;
			principal += interest;

		}
		System.out.println(principal);

	}

}
