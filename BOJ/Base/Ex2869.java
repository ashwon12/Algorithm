/**
 *  2021-02-01
 */

import java.util.Scanner;

public class Ex2869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		int day = (V-B) / (A-B);
		
		if((V-B) % (A-B) != 0) {
			day++;
		}
		
	
		System.out.println("달팽이가 올라가는데 걸린 날은 "+ day + "일 입니다.");
	}

}
