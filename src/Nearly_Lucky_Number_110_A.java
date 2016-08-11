
import java.util.*;

public class Nearly_Lucky_Number_110_A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int i = 0;
		int h = 0;
		int hh = 0;
		in.close();
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '4') {
				h++;
			}
			if (s.charAt(i) == '7') {
				h++;
			}
		}
		String kk = String.valueOf(h);
		for (i = 0; i < kk.length(); i++) {
			if (kk.charAt(i) == '4') {
				hh++;
			}
			if (kk.charAt(i) == '7') {
				hh++;
			}
		}
		if (hh == 0) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}

}