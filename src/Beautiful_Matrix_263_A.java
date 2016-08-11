
import java.util.*;

public class Beautiful_Matrix_263_A {

	public static void main(String[] args) {
		int s[][] = new int[5][5];
		int i, j, row, column;
		int counter = 0;
		i = j = row = column = 0;
		Scanner in = new Scanner(System.in);
		for (j = 0; j < 5; j++) {
			for (i = 0; i < 5; i++) {
				s[j][i] = in.nextInt();
				if (s[j][i] == 1) {
					column = i;
					row = j;
				}
			}
		}

		in.close();

		for (i = 0; i < 4; i++) {
			if (row + i < 2) {
				counter++;
			}
			if (row - i > 2) {
				counter++;
			}
		}
		for (j = 0; j < 4; j++) {
			if (column + j < 2) {
				counter++;
			}
			if (column - j > 2) {
				counter++;
			}
		}

		System.out.println(counter);
	}
}