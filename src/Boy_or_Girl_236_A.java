
import java.util.*;

public class Boy_or_Girl_236_A {

	public static void main(String[] args) {
		String s;
		int i, counter;
		counter = 0;
		Scanner in = new Scanner(System.in);
		s = in.next();
		in.close();
		char[] ar = s.toCharArray();
		Arrays.sort(ar);
		String sorted = String.valueOf(ar);

		for (i = 0; i < sorted.length() - 1; i++) {
			if (sorted.charAt(i) == sorted.charAt(i + 1))
				counter++;
		}

		if ((sorted.length() - counter) % 2 == 0) {
			System.out.print("CHAT WITH HER!");
		} else {
			System.out.print("IGNORE HIM!");
		}
	}

}