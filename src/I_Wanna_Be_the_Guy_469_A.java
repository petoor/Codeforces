import java.util.Scanner;

public class I_Wanna_Be_the_Guy_469_A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nn = in.nextInt();
		int pp= in.nextInt();
		int p[] = new int[pp];
		for (int i = 0; i < pp; i++) {
			p[i] = in.nextInt();
		}
		int qq=in.nextInt();
		int q[] = new int[qq];
		for (int i = 0; i < qq; i++) {
			q[i] = in.nextInt();
		}
		in.close();
		int n[]= new int[nn];
		for(int i = 0; i < nn ; i++){
			n[i]=i+1;
		}
		
		for(int i=0; i<nn;i++){
		for(int k =0; k<pp;k++)
			if(n[i]==p[k]){
				n[i]=0;
			}
		}
		for(int i=0; i<nn;i++){
			for(int k =0; k<qq;k++)
				if(n[i]==q[k]){
					n[i]=0;
				}
			}
		int counter=-1;
		for(int i = 0; i< nn;i++){
			counter += n[i];
		}
	if(counter==-1){
		System.out.println("I become the guy.");
	}else{
		System.out.println("Oh, my keyboard!");
	}
	}

}
