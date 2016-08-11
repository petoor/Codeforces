import java.util.Scanner;

public class Watermelon_4_A {
	public static void main(String args[]) {
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		in.close();
		if (n == 2) {
			System.out.println("NO");
		} else if ((n % 2) == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
