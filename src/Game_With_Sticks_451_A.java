import java.util.Scanner;

public class Game_With_Sticks_451_A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		in.close();
		int i=0;
			while(m>1 && n>1){
				m--;
				n--;
				i++;
			}

						
		if (i % 2 == 1) {
			System.out.println("Malvika");
		} else {
			System.out.println("Akshat");
		}

	}
}
