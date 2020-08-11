public class Ex4676 {
	
	private static boolean[] notSelf = new boolean[10001];

	public static void main(String[] args) {
		for(int i=1; i<10000; i++) {
			int dn = dn(i);
			if(dn <=10000) {
				notSelf[dn] =true;
			}
		}
			
		for(int j=1; j<notSelf.length; j++) {
			if(!notSelf[j]) {
				System.out.println(j);
			}
		}

	}
	
	public static int dn(int n) {
		int num=n;
		while( n!=0) {
			num += n%10;
			n /= 10;
		}
		return num;
	}
		
	

}
