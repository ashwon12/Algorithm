import java.util.Scanner;

public class Ex10039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int[] std= new int[5];
		int temp=0;
		
		for(int i=0; i<5; i++) {
			std[i]=scan.nextInt();
			if(std[i]<40) {
				std[i]=40;
			}
			temp=temp+std[i];
		}
		temp=temp/5;
		System.out.println(temp);
		
	}

}
