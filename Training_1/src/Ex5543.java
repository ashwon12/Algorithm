import java.util.Scanner;

public class Ex5543 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int hamburger=2000,drink=2000;
		int price;
		
		for(int i=0; i<3; i++) {
			price=scan.nextInt();
			if(price<=hamburger) {
				hamburger=price;
			}
		}
		
		for(int i=3; i<5; i++) {
			price=scan.nextInt();
			if(price<=drink) {
				drink=price;
			}
		}
		
		System.out.println((hamburger+drink-50));

	}

}
