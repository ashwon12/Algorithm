import java.util.Scanner;

public class Ex1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int left, right,newRight=0,cycle=0;
		
		left = N/10;
		right = N%10;
		
		while(true) {	
			newRight = left+right;
			left = right;
			right=newRight%10;
			cycle++;
			if(N== ((left*10)+right)) {
				break;
			}
		}
		System.out.println(cycle);
	}

}
