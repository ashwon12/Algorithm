import java.util.Scanner;

public class Ex10818 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] array = new int[N];
		int big=-1000000;
		int small=1000000;
		
		for(int i=0; i<N; i++) {
			array[i]=scan.nextInt();
			if(big<array[i]) {
				big=array[i];
			}
			if(small>array[i]) {
				small=array[i];
			}
		}
		System.out.println(small +" "+big);
	}

}
