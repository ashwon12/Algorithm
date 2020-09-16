import java.util.Random;
import java.util.Scanner;

public class Quiz_3 {

	private static int mid,min1,min2=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int N=scan.nextInt();
		int[] Array = new int[N];
		int min;
		
		for(int i=0; i<N; i++) {
			Array[i]=(random.nextInt(N))+1; // Array에 1~N 사이의난수 입력받기
			System.out.print(+Array[i]+" ");
		}
		System.out.println();
		
		min = Findmin(Array,0,N);
		System.out.println("최솟값은" +min);
	}
	
	private static int Findmin(int[] array, int i, int j) {
		
		if(i==j) {
			return array[i];
		}else if(i==j-1){
			if(array[i]<array[j]) {
				return array[i];
			}else {
				return array[j];
			}
		}else {
			mid = (i+j)/2;
			min1=Findmin(array,i,mid);
			min2=Findmin(array,mid+1,j);
			if(min1<min2) {
				return min1;
			}else {
				return min2;
			}
		}
		
	}

}
