/**
 *  2021-02-02
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2292 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		
		int range = 2;
		int output= 1;
		
		
		
		if(N ==1) {
			System.out.println("1");
		}else{
			while(range <= N) {
				range = range + (6*output);
				output++;
			}
			System.out.println(output);
		}
	}

}
