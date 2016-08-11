
import java.util.*;

public class Twins_160_A {

	public static void main(String[] args) {
		int i;
		int counter = 0;
		int sum = 0;
		int antal = 0;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s[] = new int[n];
		int g[] = new int[n];
		for (i = 0; i < n; i++) {
			s[i] = in.nextInt();
		}
		in.close();

		Arrays.sort(s);

		for (i = 0; i < n; i++) {
			sum += s[i];
			g[n - 1 - i] = s[i];
		}
		for (i = 0; i < n; i++) {
			if (counter < (sum / 2) + 1) {
				counter += g[i];
				antal++;
			}
		}

		System.out.print(antal);
	}
}