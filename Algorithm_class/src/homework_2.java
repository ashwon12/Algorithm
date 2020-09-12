import java.util.Scanner;

public class homework_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		scan.close();
		
		System.out.println(output(N));
	}
	
	public static int output(int n) {
		if(n<=1) {
			return n;
		}else {
			return output(n-1)+output(n-2);
		}
	}

}
