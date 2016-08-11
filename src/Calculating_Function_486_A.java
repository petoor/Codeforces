
import java.math.BigInteger;
import java.util.Scanner;

public class Calculating_Function_486_A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		in.close();

		if ((n.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO) == 0)) {
			System.out.println(n.divide(BigInteger.valueOf(2)));
		} else {
			System.out.println(
					(n.divide(BigInteger.valueOf(2)).add(BigInteger.valueOf(1)).multiply(BigInteger.valueOf(-1))));
		}
	}
}
