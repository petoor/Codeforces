
import java.util.*;

public class Insomnia_cure_148_A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int n = in.nextInt();
		int l = in.nextInt();
		int m = in.nextInt();
		int d = in.nextInt();
		in.close();
		int i;
		int counter = 0;
		for (i = 1; i <= d; i++) {
			if (i % k == 0 || i % n == 0 || i % l == 0 || i % m == 0) {
				counter++;
			}
		}
		System.out.print(counter);
	}
}