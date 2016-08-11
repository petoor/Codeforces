import java.util.Scanner;

public class Team_231_A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int i, output;
		output = 0;
		int[] person1 = null;
		int[] person2 = null;
		int[] person3 = null;
		person1 = new int[n];
		person2 = new int[n];
		person3 = new int[n];

		for (i = 0; i < n; i++) {
			person1[i] = in.nextInt();
			person2[i] = in.nextInt();
			person3[i] = in.nextInt();
		}
		in.close();
		for (i = 0; i < n; i++) {
			if (person1[i] + person2[i] + person3[i] >= 2) {
				output++;
			}
		}
		System.out.println(output);
	}
}