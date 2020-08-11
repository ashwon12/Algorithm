import java.util.Scanner;

public class Ex1065 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int count=0;
		
		for(int i=0; i<N; i++) {
			if(whoareyou(i) == true) {
				count ++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean whoareyou(int n) {
		int a,b,c;
		if(n<100){
			return true;
		}else {
			for(int i=100; i<=n; i++) {
				a =n/100;
				b=(n/10)%10;
				c =n%10;
				
				if((a-b) ==(b-c)) {
					return true;
				}else {
					return false;
				}
			}
		}
		return false;
		
	}
}


