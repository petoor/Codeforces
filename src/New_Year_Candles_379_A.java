
import java.util.*;

public class New_Year_Candles_379_A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double g = in.nextDouble();
		int b = in.nextInt();
		in.close();
		int c = 0;
		double k = 0.0;
		int m = (int) g;
		int leftover = 0;

		while (g + leftover >= b) {
			g = (g + leftover) / b;
			k = g - Math.floor(g);
			leftover = (int) (k * b);
			c += g;
			// System.out.println(g + " " + leftover+" "+k);
		}
		System.out.println(m + c);
	}
}