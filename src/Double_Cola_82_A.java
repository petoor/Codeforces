
import java.util.*;

public class Double_Cola_82_A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double input = in.nextDouble();
		in.close();
		int n = 0;
		int result;
		double counter = 1;
		while (input > Math.pow(2, n) * 5) {
			input = input - (Math.pow(2, n) * 5);
			counter = Math.pow(2, n + 1);
			n++;
		}

		result = (int) Math.ceil(input / counter);
		if (result == 1) {
			System.out.print("Sheldon");
		} else if (result == 2) {
			System.out.print("Leonard");
		} else if (result == 3) {
			System.out.print("Penny");
		} else if (result == 4) {
			System.out.print("Rajesh");
		} else {
			System.out.print("Howard");
		}
	}

}