import java.util.Scanner;

public class Ex10809 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		
		for(char alpa ='a'; alpa<='z'; alpa++) {
			System.out.print(S.indexOf(alpa)+" ");
		}
	}

}
