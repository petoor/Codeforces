
import java.util.*;

public class Stones_on_the_Table_266_A {

	public static void main(String[] args) {
		int n, i, counter;
		counter = 0;
		String s;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		s = in.next();
		in.close();
		for (i = 0; i < n - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}