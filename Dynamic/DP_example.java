import java.util.Scanner;

public class DP_example {
	
	private static Scanner scan = new Scanner(System.in);
	private static int N=4;
	private static int[] maxSell = new int[N];
	private static int[] p = {5,1,2,10};

	public static void main(String[] args) {
	
		int maxprice=cutRod_DC(p,N-1);
		System.out.println(maxprice);
	}
	
	private static int cutRod_DC(int[] p, int n) {
		if(n ==0) return 0;
		else {
			for(int j=1; j<=n; j++) {
				maxSell[0]=0;
				int maxVal=0;
				for(int k=1; k<=j; k++) {
					maxVal=MAX(maxVal,p[k]+maxSell[j-k]);
					maxSell[j]=maxVal;
				}	
			}
			return maxSell[n];
		}		
	}

	private static int MAX(int j, int i) {
		if(i>j) return i;
		else return j;
	}



}
