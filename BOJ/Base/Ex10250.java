/**
 *  2021-02-02
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10250 {

	public static void main(String[] args)  throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int Y,X=0;
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int H = Integer.parseInt(st.nextToken());
			st.nextToken();
			int N = Integer.parseInt(st.nextToken());
			
			if( N%H ==0) {
				Y = H*100;
				X = (N/H);
			}else {
				Y = (N%H)*100;
				X= (N/H)+1;
			}
			
			System.out.println(Y+X);
		}
		
	}

}
