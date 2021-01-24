import java.util.Scanner;

/*무게가 n인 다이아몬드를 자르는 방법의 갯수를 구하는 문제 */

public class Quiz_5 {
	
	private static int[] C = new int[5];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		
		int print = DP(N);
		System.out.print(print);
	}

	private static int DP(int n) {
		// TODO Auto-generated method stub
		if(n==1) return 0;
		else {
			for(int i=1; i<=n; i++) {
				C[0]=0;
				C[1]=0;
				int temp=0;
				for(int j=1; j<=i; j++) {
					temp = j + C[i-j];
					System.out.println(i+" "+j+" "+temp);
					C[j]= temp;
				}
			}
			return C[n];
		}
	}

}
