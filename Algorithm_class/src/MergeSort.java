import java.util.Random;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		int N=scan.nextInt();
		int[] Array = new int[N];
		
		System.out.print("정렬 전 : ");
		for(int i=0; i<N; i++) {
			Array[i]=(random.nextInt(100))+1; // Array에 1~N 사이의난수 입력받기
			System.out.print(Array[i]+" ");
		}
		System.out.println("");
		
		mergeSort(Array,0,(Array.length)-1);
		
	}

	private static void mergeSort(int[] array, int i, int j) {
		if(i<j) {
			int mid = (i+j)/2;
			mergeSort(array,i,mid);
			mergeSort(array,mid+1,j);
			merge(array,i,mid,j);                                                                                                                                                                                                                                
		}
	}

	private static void merge(int[] array, int low, int mid, int high) {
		int[] tempArray = new int[high+1];
		int h=low;
		int i=low;
		int j= mid+1;
		
		while(i <= mid && j<= high){
			if(array[i]<=array[j]) {
				tempArray[h++]=array[i++];
			}else {
				tempArray[h++]=array[j++];
			}
		}

		while(i<=mid) {
			tempArray[h++]=array[i++];
		}
		
		while(j<=high){
				tempArray[h++]=array[j++];	
		}
		
		System.out.print("정렬 후 : ");
		for(int k = low; k <= high; k++) {
			array[k] = tempArray[k];
			System.out.print(array[k]+" ");
		}
		System.out.println("");
	}
}
