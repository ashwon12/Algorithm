import java.util.Scanner;

public class Ex11720 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		String N2=scan.next();
		int sum=0;
		
		for(int i=0; i<N; i++) {
			sum += N2.charAt(i)-'0';
		}
		
		System.out.println(sum);

	}

}
