import java.util.Scanner;

public class Ex10951 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int A=0,B=0;
		
		while(scan.hasNextInt()) {
			A = scan.nextInt();
			B = scan.nextInt();
			System.out.println((A+B));
		}
	}
}
