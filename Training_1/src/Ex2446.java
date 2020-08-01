import java.util.Scanner;
public class Ex2446 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(2*N-1)-(i*2); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=0; i<N-1; i++) {
			for(int j=1; j<(N-1)-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<3+(i*2); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	
		
	}

}
