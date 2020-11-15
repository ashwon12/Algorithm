import java.util.Arrays;
import java.util.Scanner;

public class homework_9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] num = new int[N];
		int[] res = new int[K];
		for (int i=0; i<N; i++) {
			num[i]=i+1;
			System.out.print(num[i]+" ");
		}
		System.out.println();
		
		System.out.println("1~ "+ N+"에서"+K+"개를 뽑는 중복 순열");
		Permutation(num,0,N,K,res);

	}

	private static void Permutation(int[] num, int depth, int n, int k, int[] res) {
		if(depth == k) {
			System.out.println(Arrays.toString(res));
            return;
		}
		
		for(int i= 0; i < n; i++) {
			swap(num,depth,i);
			res[depth] = num[depth];
			Permutation(num, depth+1, n, k,res);
			swap(num, i, depth);
		}
		
	}

	private static void swap(int[] item, int i, int j) {
		int temp = item[i];
		item[i] =  item[j];
		item[j] = temp;	
	}

}
