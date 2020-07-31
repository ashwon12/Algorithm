import java.util.Scanner;

public class Ex10952 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int A=1,B=1;
		
		while(true) {
			A = scan.nextInt();
			B = scan.nextInt();
			if(A==0 && B==0) {
				break;
			}
			System.out.println((A+B));
		}
	}
}
