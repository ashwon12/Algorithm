import java.util.Scanner;
import java.util.Arrays;

public class Ex8958 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt(); // 테스트 케이스의 개수
		String[] str = new String[N]; // 문자열
		
		for(int i=0; i<N; i++) {
			int count=0,score=0;
			str[i]=scan.next();
			for(int j=0; j<str[i].length(); j++) {
				if(str[i].charAt(j)=='O') {
					score += ++count;
				}else {
					count=0;
				}
			}
			System.out.println(score);
		}
		
		scan.close();
	}

}
