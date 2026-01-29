import java.util.Random;

public class lottery {

	public static void main(String[] args) {
		Random rnd = new Random();

		int n1 = 1 + rnd.nextInt(71 - 1);
		int n2 = 1 + rnd.nextInt(71 - 1);
		int n3 = 1 + rnd.nextInt(71 - 1);
		int n4 = 1 + rnd.nextInt(71 - 1);
		int n5 = 1 + rnd.nextInt(71 - 1);
		System.out.println("Mega Millions Number is: " + n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5);

		int n6 = 1 + rnd.nextInt(26 - 1);
		System.out.println("Mega Ball is: " + n6);

		int n7 = 1 + rnd.nextInt(70 - 1);
		int n8 = 1 + rnd.nextInt(70 - 1);
		int n9 = 1 + rnd.nextInt(70 - 1);
		int n10 = 1 + rnd.nextInt(70 - 1);
		int n11 = 1 + rnd.nextInt(70 - 1);
		System.out.println("Power Ball Number is: " + n7 + " " + n8 + " " + n9 + " " + n10 + " " + n11);

		int n12 = 1 + rnd.nextInt(27 - 1);
		System.out.println("Power Ball is: " + n12);

	}

}
