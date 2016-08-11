import java.util.Scanner;

public class Next_Round_158_A {
	public static void main(String[] args) {

		int[] scores = new int[50];
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int k = in.nextInt();
		for (int i = 0; i < n; i++) {
			scores[i] = in.nextInt();
		}
		in.close();
		int scoreToMakeCut = scores[k - 1];
		boolean iterate = true;
		int index = 0;
		while (iterate && index < n) {
			if (scores[index] >= scoreToMakeCut && scores[index] > 0) {
				index++;
			} else {
				iterate = false;
			}
		}

		System.out.println(index);
	}
}