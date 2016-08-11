
import java.util.*;

public class Presents_136_A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] output = new int[n + 1];

		int i, k;
		for (i = 1; i <= n; i++) {
			k = in.nextInt();
			output[k] = i;
		}
		in.close();
		for (i = 1; i <= n; i++) {
			System.out.print(output[i] + " ");
		}
	}

}