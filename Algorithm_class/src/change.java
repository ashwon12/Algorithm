
public class change {

	public static void main(String[] args) {
		int[] A = {-15,0,-28,9,-9,4,0,0};
		
		sort(A,0,A.length-1);
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println("");
	}

	
	private static void sort(int[] S, int low, int high) {
		int pivot=high+low;
		
		while(pivot >= low) {
			if(S[pivot]>0) {
				swap(S,pivot,high);
				high--;
				pivot--;
			}else if(S[pivot]<0) {
				swap(S,pivot,low);
				low++;
			}else if(S[pivot]==0) {
				pivot--;
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
