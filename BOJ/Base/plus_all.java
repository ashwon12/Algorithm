import java.util.Scanner;

public class plus_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N=0;
		int empty=0;
		
		Scanner scan =new Scanner(System.in);
		N=scan.nextInt();
		
		for(int i=1; i<=N; i++) {
			empty += i;
		}
		
		System.out.println(empty);
	}

}
