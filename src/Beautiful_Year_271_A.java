
import java.util.*;

public class Beautiful_Year_271_A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		n = n + 1;
		boolean sandt = true;
		int et, to, tre, fire;
		while (sandt == true) {
			et = n % 10;
			to = (n % 100) / 10;
			tre = (n % 1000) / 100;
			fire = (n % 10000) / 1000;
			if (et == to || et == tre || et == fire || to == tre || to == fire || tre == fire) {
				n++;
			} else {
				sandt = false;
			}
		}
		System.out.print(n);
	}
}