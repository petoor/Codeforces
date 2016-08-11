import java.util.*;

public class String_Task_118_A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.next();
		in.close();
		int i;
		String g = "";
		n = n.toLowerCase();
		n = n.replaceAll("[a,e,i,o,y,u,i]", "");
		for (i = 1; i < n.length() + 1; i++) {
			g = g.concat(".").concat(n.substring(i - 1, i));
		}
		System.out.println(g);
	}
}