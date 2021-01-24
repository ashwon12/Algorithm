import java.util.Scanner;

public class Ex11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T=scan.nextInt();
		
		
		for(int i=1; i<=T; i++) {
			int A =scan.nextInt();
			int B=scan.nextInt();
			
			System.out.println("Case #"+i+": "+(A+B));
		}
	}

}
