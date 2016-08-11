import java.util.Scanner;

public class Elephant_617_A {

	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		 int x, y;
		 x = in.nextInt();
		 y =1;
		 in.close();
	
     while(x>5){
		x=x-5;
		y++;
	 }
	System.out.println(y);
	}

}