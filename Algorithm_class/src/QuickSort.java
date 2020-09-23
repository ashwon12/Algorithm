
public class QuickSort {

	public static void main(String[] args) {
		int[] A = {15, 22, 13, 27, 12, 10, 20,25};
		
		quicksort(A,0,A.length-1);
		
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println("");
	}

	private static void quicksort(int[] A, int low, int high) {
		
		if(low<high) {
			int s = partition(A,low,high);
			quicksort(A,low,s-1);
			quicksort(A,s+1,high);
		}
		
	}

	private static int partition(int[] S, int low, int high) {
		int i = low+1;
		int j = high;
		
		while(i <= j) {
			if(S[i]<=S[low]) {
				i++;
			}else if(S[j]>S[low]) {
				j--;
			}else {
				swap(S,i,j);
				i++;
				j--;
			}
		}
		swap(S,low,j);
		return j;
	}

	private static void swap(int[] s, int i, int j) {
		int temp;
		
		temp=s[i];
		s[i]=s[j];
		s[j]=temp;
		
	}

}
