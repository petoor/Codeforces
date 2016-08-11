
import java.util.*;

public class Soldier_and_Bananas_546_A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int n = in.nextInt();
		int w = in.nextInt();
		in.close();
		int i, counter;
		counter = i = 0;
		for (i = 0; i <= w; i++) {
			counter += k * i;
		}
		if (counter - n <= 0) {
			System.out.println(0);
		} else {
			System.out.println(counter - n);
		}
	}

}