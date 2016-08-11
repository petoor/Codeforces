import java.util.Scanner;

public class Domino_piling_50_A {

	public static void main(String[] args) {
		int m, n, a;
		Scanner in = new Scanner(System.in);
		m = in.nextInt();
		n = in.nextInt();
		in.close();
		a = Math.floorDiv(m * n, 2);

		System.out.println(a);
	}
}
