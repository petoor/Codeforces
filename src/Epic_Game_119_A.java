
import java.util.Scanner;

public class Epic_Game_119_A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int n = in.nextInt();
		in.close();
		int counter = 0;
		while (n != 0) {
			if (counter == 0) {
				n = n - gcd(a, n);
				counter++;
			} else {
				n = n - gcd(b, n);
				counter--;
			}
			// System.out.println(n + " " + counter);
		}
		if (counter == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	public static int gcd(int a, int b) {
		int d = 0;
		while (a % 2 == 0 && b % 2 == 0) {
			a = a / 2;
			b = b / 2;
			d++;
		}
		while (a != b) {
			if (a % 2 == 0) {
				a = a / 2;
			} else if (b % 2 == 0) {
				b = b / 2;
			} else if (a > b) {
				a = (a - b) / 2;
			} else {
				b = (b - a) / 2;
			}
		}
		return ((int) (a * Math.pow(2, d)));
	}
}