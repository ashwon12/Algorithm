import java.util.Scanner;
public class Alarm {
	
	public static void main(String[] args) {
		int hour=0;
		int min=0;
		Scanner scan = new Scanner(System.in);
		
		hour=scan.nextInt();
		min=scan.nextInt();
		
		min-=45;
		
		if(min <0) {
			min +=60;
			hour--;
			if(hour <0) {
				hour +=24;
			}
		}
		
		System.out.println(hour);
		System.out.print(min);
	}

}
