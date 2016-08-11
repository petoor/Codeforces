
import java.util.*;

public class Translation_41_A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String p = in.next();
		int k = 0;
		in.close();

		if (s.length() == p.length()) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == p.charAt(p.length() - i - 1)) {
					k++;
				}
			}
		}
		if (k == s.length()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}