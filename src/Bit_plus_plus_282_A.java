import java.util.*;

public class Bit_plus_plus_282_A {

	public static void main(String[] args) {
		int x, n, i;
		x = i = 0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		String[] s = new String[n];
		for (i = 0; i < n; i++) {
			s[i] = in.next();
			if (s[i].contains("--")) {
				x--;
			} else {
				x++;
			}
		}
		in.close();
		for (i = 0; i < n; i++) {
		}
		System.out.println(x);
	}

}