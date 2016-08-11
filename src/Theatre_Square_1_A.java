import java.util.Scanner;

public class Theatre_Square_1_A {
	public static void main(String args[]) {
		long m, n, a, b, c, max;
		Scanner in = new Scanner(System.in);
		m = in.nextInt();
		n = in.nextInt();
		a = in.nextInt();
		in.close();

		b = (m - 1) / a + 1;
		c = (n - 1) / a + 1;
		max = b * c;

		System.out.println(max);
	}
}