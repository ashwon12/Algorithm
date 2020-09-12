import java.util.Random;
import java.util.Scanner;

public class homework_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		int N=scan.nextInt();
		int[] Array = new int[N];
		int[] newArray = new int[N+1];
		
		for(int i=0; i<N; i++) {
			Array[i]=(random.nextInt(N))+1; // Array에 1~N 사이의난수 입력받기
			System.out.println(Array[i]);
			newArray[i]=0;// newArray 0으로 초기화
		}
		
		for(int i=0; i<N; i++) {
			newArray[(Array[i])]=1;
		}
		
		for(int i=1; i<=N;i++) {
			if(newArray[i]==0) {
				System.out.println("빠진 숫자는"+i);
			}
		}
	}

}
