import java.util.Scanner;
import java.util.Arrays;

public class Ex1546 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		double[] score=new double[N];
		double average=0;
		
		// 점수 입력받기
		for(int i=0; i<score.length; i++) {
			score[i]=scan.nextDouble();
		}
		scan.close();
		
		// 정렬을 해서 최댓값 찾기
		Arrays.sort(score);
		
		// 새롭게 정의 된 점수 평균에 담아주기
		for(int i=0; i<score.length; i++) {
			average += ((score[i]/score[N-1])*100);
		}

		System.out.println(average/N);
	}

}
