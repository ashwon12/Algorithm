import java.util.Scanner;


/* 비재귀 이진탐색 */
public class binary_Search {
	
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	int[] S = {8, 13, 25, 28, 35, 41, 48, 53, 57, 60, 68, 72, 83, 85, 88, 92, 96, 99};
	int key=scan.nextInt(); // 찾을 숫자 입력받기
	
	binarySearch(S, 0, (S.length)-1, key);
	
	int test=-1;
	System.out.println(test);
	}
	
	private static void binarySearch ( int[] arr,int left, int right, int key){
		
		while(right >= left){
			int mid = (left+right) /2;
		
			if(arr[mid] == key) {
				System.out.println(key+"는 배열의 인덱스 "+mid+"있습니다.");
				return;
			}else if(arr[mid] >key){
				right = mid-1;
			} else {
				left = mid+1;
			}
		}
		System.out.println(key+"는 배열에 없습니다.");
		return ;
	}
}


