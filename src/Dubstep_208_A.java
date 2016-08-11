import java.util.Scanner;

public class Dubstep_208_A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();

		s = s.replaceAll("WUB", " ");
		s=s.trim();
		System.out.println(s);
	}

}
