import java.util.Scanner;

public class gogodan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0;
		Scanner scan = new Scanner(System.in);
		
		n=scan.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(n +" * "+i+" = "+n*i);
		}
		
	}
}
