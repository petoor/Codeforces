
import java.util.Scanner;

public class Word_Capitalization_281_A {

	public static void main(String[] args) {
		String s;
		Scanner in = new Scanner(System.in);
		s = in.next();
		in.close();
		s = s.substring(0, 1).toUpperCase().concat(s.substring(1, s.length()));
		System.out.println(s);
	}

}