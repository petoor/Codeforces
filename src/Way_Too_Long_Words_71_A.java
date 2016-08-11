import java.util.*;

public class Way_Too_Long_Words_71_A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		int i;
		int[] slut = new int[p];

		String ord[] = new String[p];
		for (i = 0; i < p; i++) {
			ord[i] = in.next();
			slut[i] = ord[i].length();
		}

		in.close();
		for (i = 0; i < p; i++) {
			if (ord[i].length() <= 10) {
				System.out.println(ord[i]);
			} else {
				System.out
						.println(ord[i].charAt(0) + Integer.toString(ord[i].length() - 2) + ord[i].charAt(slut[i] - 1));
			}
		}
	}
}
