import java.util.Scanner;

public class scannerApp {

	public static void main(String[] args) {

		System.out.println("What is your name?");

		Scanner name = new Scanner(System.in);
		String person = name.nextLine();

		System.out.println("Hello" + " " + person);

		System.out.println("how old are you?");
		Scanner age = new Scanner(System.in);
		String old = age.nextLine();
		System.out.println(person + " " + old);

	}

}
