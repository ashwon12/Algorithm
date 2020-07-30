import java.util.Scanner;

public class plus_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int T=0;
		int A=0;
		int B=0;
		
		
		T=scan.nextInt();
		for(int i=0; i<T; i++) {
			A=scan.nextInt();
			B=scan.nextInt();
			
			System.out.println(A+B);
		}	
	}
}
