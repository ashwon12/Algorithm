import java.util.Scanner;

public class Ex2577 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A=scan.nextInt();
		int B=scan.nextInt();
		int C=scan.nextInt();
		int result =A*B*C;
		
		String num = Integer.toString(result);
		
		for(int i=0; i<10; i++) {
			int count=0;
			for(int j=0; j<num.length(); j++) {
				if(num.charAt(j)-'0'==i) {
					count ++;
				}
			}
			System.out.println(count);
		}

	}

}
