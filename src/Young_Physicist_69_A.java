import java.util.Scanner;

public class Young_Physicist_69_A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m[][] = new int[n][3];
		for(int i = 0; i < n ; i++){
			for(int j = 0; j < 3; j++){
				m[i][j]=in.nextInt();
			}
		}
		in.close();
		int counter=0;
		for(int j = 0; j < 3 ; j++){
			for(int i = 0; i < n; i++){
				counter+=m[i][j];
			}
			if(counter!=0){
				break;
			}
		}
		if(counter==0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		
	}

}
