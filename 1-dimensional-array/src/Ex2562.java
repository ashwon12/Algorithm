import java.util.Scanner;

public class Ex2562 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array=new int[9];
		int num=0,big=0;
		
		for(int i=0; i<9; i++) {
			array[i]=scan.nextInt();
			if(big<array[i]) {
				big=array[i];
				num = i+1;
			}
		}
		System.out.println(big+"\n"+num);
		
	}

}
