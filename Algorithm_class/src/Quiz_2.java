import java.util.Scanner;

public class Quiz_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n=scan.nextInt();
		int output=0;
		
		if(n>0) {
			return8(n);
		}else {
			n=0;
		}
		output=(int)(Math.log10(n)+1);
		System.out.println(output);
	}
	
	public static int return8(int n) {
		if(n>0) {
			return8(n/8);
			return n%8;
		}else {
			return n;
		}
	}

}
