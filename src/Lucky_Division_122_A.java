
import java.util.ArrayList;
import java.util.Scanner;

public class Lucky_Division_122_A {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		ArrayList<Integer> fireogsyv = new ArrayList<Integer>(13);
		// Exploiting the fact that n<1000, this is a bad solution.
		// For future references, make a solution such that it is true for 
		// n in N.
		fireogsyv.add(4);
		fireogsyv.add(7);
		fireogsyv.add(47);
		fireogsyv.add(77);
		fireogsyv.add(44);
		fireogsyv.add(74);
		fireogsyv.add(444);
		fireogsyv.add(447);
		fireogsyv.add(474);
		fireogsyv.add(477);
		fireogsyv.add(744);
		fireogsyv.add(747);
		fireogsyv.add(777);

		int n = in.nextInt();
		in.close();
		int i;
		i = 0;
		int q;
		q = 0;
		for (fireogsyv.get(i); i < fireogsyv.size(); i++) {
			if ((n % fireogsyv.get(i)) == 0) {
				System.out.println("YES");
				break;
			} else {
				q++;
			}
		}
		if (q == 13) {
			System.out.println("NO");
		}
	}
}