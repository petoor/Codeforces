
import java.util.*;

public class Design_Tutorial_Learn_from_Math_472_A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int s, p;
		if (n % 2 == 1) {
			s = n - ((n - 1) / 2);
			p = n - ((n + 1) / 2);
		} else {
			s = n - n / 2;
			p = n - n / 2;
		}
		while (prime(s) == true || prime(p) == true) {
			s++;
			p--;
		}

		System.out.println(s + " " + p);
	}

	public static boolean prime(int n) {
		int i;
		boolean p = true;
		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				p = false;
				break;
			}
		}
		return p;
	}
}