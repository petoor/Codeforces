import java.util.Scanner;

public class Expression_479_A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		in.close();

		if (a == 1) {
			b++;
		}
		if (b == 1) {
			if (a > c) {
				c++;
			} else {
				a++;
			}
		}
		if (c == 1) {
			b++;
		}

		System.out.println(a * b * c);
	}

}
