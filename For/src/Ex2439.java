import java.util.Scanner;

public class Ex2439 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N =scan.nextInt();
		
		for(int i=1; i<=N; i++) {
			for(int j=N-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}