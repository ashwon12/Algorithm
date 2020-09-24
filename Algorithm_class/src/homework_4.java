
public class homework_4 {

	public static void main(String[] args) {
		int[] A = {-15,0,-28,9,-9,4,0,0};
		
		sort(A,0,A.length-1);
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println("");
	}

	
	private static void sort(int[] S, int low, int high) {
		int pivot=low;
		
		while(pivot <= high) {
			if(S[pivot]>0) {
				swap(S,pivot,high);
				high--;
			}else if(S[pivot]<0) {
				swap(S,pivot,low);
				pivot++;
				low++;
			}else if(S[pivot]==0) {
				pivot++;
			}
		}
	}

	private static void swap(int[] s, int i, int j) {
		int temp;
		temp=s[i];
		s[i]=s[j];
		s[j]=temp;
	}

}
