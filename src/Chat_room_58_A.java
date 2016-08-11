
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chat_room_58_A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();

		Pattern p = Pattern.compile(".*h+.*e+.*l+.*l+.*o+.*");
		Matcher m = p.matcher(s);
		if (m.find()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}