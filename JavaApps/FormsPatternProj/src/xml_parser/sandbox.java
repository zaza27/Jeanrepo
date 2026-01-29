package xml_parser;

import java.util.Scanner;

public class sandbox {
	public static void main(String[] args) {
		int day = 0;
		int age = 4;

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("This number is not a valid number...");

		}

		if (age == 3) {
			System.out.println("Jason Smith");
		}
		if (age == 4) {
			System.out.println("Jean Exavier");
		}

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println("Value is " + i);
		}
		System.out.println("What is your name?");
		Scanner person = new Scanner(System.in);
		String name = person.nextLine();
		System.out.println("Hello" + " " + name);

	}

}
