import java.util.Scanner;
public class Ex10996 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		
		for(int i=0; i<(2*N); i++) {
			if(i%2==0) {
				for(int j=0; j<N; j++) {
					if(j%2 !=0) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
			}else {
				for(int j=0; j<N; j++) {
					if(j%2 !=0) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
		
		
	}

}
