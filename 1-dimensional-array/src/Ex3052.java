import java.util.HashSet;
import java.util.Scanner;

public class Ex3052 {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<Integer> myVals = new HashSet<Integer>();
		
		//입력받기
		for(int i=0; i<10; i++) {
			myVals.add((scan.nextInt())% 42);
		}
		
		System.out.println(myVals.size());
		
	}

}
