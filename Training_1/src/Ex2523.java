import java.util.Scanner;
public class Ex2523 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=0; i<=N-1; i++) {
			for(int j=0; j<N-i-1; j++) {
				System.out.print("*");
			}		
			System.out.println("");
		}
		
	}

}
