import java.util.Scanner;

public class homework_3 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] S = {8, 13, 25, 28, 35, 41, 48, 53, 57, 60, 68, 72, 83, 85, 88, 92, 96, 99};
		int key=scan.nextInt(); // 찾을 숫자 입력받기
		scan.close();
			
		Search(S,0,(S.length),key);
	}
	
	public static int Search(int S[],int start,int end, int key) {
		
		if(start>=end) {
			System.out.println(key+"는 배열에 없습니다.");
			return 0;
		}else {
			int mid1=start+((end-start)/3);
			int mid2=end-((end-start)/3);
			
			if(key==S[mid1]) {
				System.out.println(key+"는 배열의 인덱스 "+mid1+"있습니다.");
				return 0;
				
			}else if(key == S[mid2]) {
				System.out.println(key+"는 배열의 인덱스 "+mid2+"있습니다.");
				return 0;
			}
			if( key<S[mid1]) {
				Search(S,start,mid1,key);
			}else if( key<S[mid2]) {
				Search(S,mid1+1,mid2,key);
			}else{
				Search(S,mid2+1,end,key);
			}
		}
		return 0;
		
	}
	
	
	

}
