
import java.util.Scanner;

public class George_and_Accommodation_467_A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, counter = 0;
		int n = in.nextInt();
		int s[][] = new int[2][n];
		for (i = 0; i < n; i++) {
			s[0][i] = in.nextInt();
			s[1][i] = in.nextInt();

		}
		in.close();
		for (i = 0; i < n; i++) {
			if (s[1][i] - s[0][i] >= 2) {
				counter++;
			}
		}
		System.out.print(counter);

	}

}