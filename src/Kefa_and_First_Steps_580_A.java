	import java.util.Scanner;
	
	public class Kefa_and_First_Steps_580_A {
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int m[] = new int[n];
			for (int i = 0; i < n; i++) {
				m[i] = in.nextInt();
			}
			in.close();
			int counter = 1;
			int save = 1;
			if (n == 1) {
				System.out.println(counter);
			} else {
				for (int i = 1; i < n; i++) {
					if (m[i] >= m[i - 1]) {
						counter++;
						if (save <= counter) {
							save = counter;
						}
					} else {
						counter = 1;
					}
				}
				System.out.println(save);
			}
		}
	
	}
