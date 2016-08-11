
import java.util.*;

public class cAPS_lOCK_131_A {
	public static void main(String[] args) {
		String a;
		Scanner in = new Scanner(System.in);
		a = in.next();
		in.close();
		if (a.substring(1, a.length()).equals(a.substring(1, a.length()).toUpperCase())) {
			if (a.substring(0, 1).equals(a.substring(0, 1).toLowerCase())) {
				a = a.toLowerCase();
				a = a.substring(0, 1).toUpperCase().concat(a.substring(1, a.length()));
			} else {
				a = a.toLowerCase();
			}
		}

		System.out.println(a);
	}
}