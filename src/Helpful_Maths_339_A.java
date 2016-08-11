import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths_339_A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		int i = 0;
		int[] n = new int[s.length()];
		for (i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				n[i] = Character.getNumericValue(s.charAt(i));
			}
		}
		Arrays.sort(n);
		for (i = s.length() / 2; i < s.length() - 1; i++) {
			System.out.print(n[i] + "+");
		}
		System.out.print(n[s.length() - 1]);
	}
}