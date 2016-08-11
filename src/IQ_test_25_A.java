import java.util.Scanner;

public class IQ_test_25_A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m[] = new int[n];
		for (int i = 0; i < n; i++) {
			m[i] = in.nextInt();

		}
		in.close();
		// Determine if it is an even or uneven number we are looking for
		int k = 0;
		int plads = 0;
		for (int i = 0; i < 3; i++) {
			if (m[i] % 2 == 0) {
				k++;
			}
		}
		if (k > 1) {
			for (int i = 0; i < n; i++) {
				if (m[i] % 2 != 0) {
					plads = i+1;
				}

			}
		} else {
			for (int i = 0; i < n; i++) {
				if (m[i] % 2 == 0) {
					plads = i+1;
				}

			}
		}

		System.out.println(plads);
	}
}
