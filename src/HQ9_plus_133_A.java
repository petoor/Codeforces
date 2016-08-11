
import java.util.*;

public class HQ9_plus_133_A {

	public static void main(String[] args) {
		String n;
		int i;
		boolean indeholder = false;
		String[] x = new String[3];
		x[0] = "H";
		x[1] = "Q";
		x[2] = "9";
		Scanner in = new Scanner(System.in);
		n = in.next();
		in.close();

		for (i = 0; i < x.length; i++)
			if (n.contains(x[i])) {
				System.out.println("YES");
				indeholder = true;
				break;
			}
		if (indeholder != true) {
			System.out.println("NO");
		}
		;
	}

}