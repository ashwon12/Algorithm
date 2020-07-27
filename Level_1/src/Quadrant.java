import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		
		int x=0;
		int y=0;
		Scanner scan = new Scanner(System.in);
		
		x = scan.nextInt();
		y =scan.nextInt();
		
		if(x>0){
			if(y>0) {
				System.out.println("1");
			}else {
				System.out.println("4");
			}
		}else {
			if(y>0) {
				System.out.println("2");
			}else {
				System.out.println("3");
			}
		}
	}

}
