import java.util.*;

public class Taxi_158_B {

	public static void main(String[] args) {
		int n, temp, numGroups;
		n = temp = numGroups = 0;
		Scanner in = new Scanner(System.in);
		int sizeGroups[] = new int[5];

		for (int i = 0; i < 5; i++)
			sizeGroups[i] = 0;
		n = in.nextInt();
		for (int i = 0; i < n; i++) {
			temp = in.nextInt();
			sizeGroups[temp]++;
		}
		in.close();
		numGroups += sizeGroups[4] + sizeGroups[3];
		if (sizeGroups[1] > sizeGroups[3]) {
			sizeGroups[1] -= sizeGroups[3];
		} else {
			sizeGroups[1] = 0;
		}
		int y = sizeGroups[2] / 2;
		sizeGroups[2] -= y * 2;
		numGroups += y;
		numGroups += sizeGroups[2];
		if (sizeGroups[1] * 2 >= sizeGroups[2]) {
			sizeGroups[1] -= sizeGroups[2] * 2;
			sizeGroups[2] = 0;
		}
		numGroups += sizeGroups[1] / 4;
		sizeGroups[1] = sizeGroups[1] % 4;
		if (sizeGroups[1] > 0) {
			numGroups++;
		}
		System.out.println(numGroups);
	}
}