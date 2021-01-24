import java.util.Scanner;

public class Ex10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int X=scan.nextInt();
		int[] A = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i] = scan.nextInt();
		}
		for(int i=0; i<N; i++) {
			if(A[i]<X) {
				System.out.print(A[i] +" ");
			}
		}
	}

}