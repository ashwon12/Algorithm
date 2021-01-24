import java.util.Arrays;
import java.util.Scanner;

public class Ex10817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int one=0,two,three=100;
		int[] N=new int[3];
		
		for(int i=0; i<3; i++) {
			N[i]=scan.nextInt();
		}
		
		Arrays.sort(N);
		System.out.print(N[1]);
		
	}

}
