
import java.util.*;

public class Petya_and_Strings_112_A {

	public static void main(String[] args) {
		String a, b;
		int x = 0;
		Scanner in = new Scanner(System.in);
		a = in.next();
		b = in.next();
		in.close();
		a = a.toLowerCase();
		b = b.toLowerCase();
		if (a.compareTo(b) < 0) {
			x = -1;
		} else if (a.compareTo(b) > 0) {
			x = 1;
		} else {
			x = 0;
		}
		System.out.println(x);
	}

}