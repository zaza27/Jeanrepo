import java.security.SecureRandom;

public class UniqueNumber {

	static int[] createUniqueRandomNumbers(int from, int to) {
		int n = to - from + 1;

		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i;
		}

		int[] result = new int[n];

		int x = n;
		SecureRandom rd = new SecureRandom();
		for (int i = 0; i < n; i++) {
			int k = rd.nextInt(x);

			result[i] = a[k];

			a[k] = a[x - 1];
			x--;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] result = createUniqueRandomNumbers(4, 15);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}
}
