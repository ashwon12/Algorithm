
public class homework_5 {
	
	private static int w=4;
	private static int[] sellPrice = {3,4,8,9};
	private static int[] cutPrice = {1,2,1,0};
	private static int[] maxPrice= new int[4+1];

	public static void main(String[] args) {
		
		maxPrice[0]=0;
		int diamondprice=diamond_DC(sellPrice,cutPrice,w);
		System.out.println("다이아몬드의 최대금액은 "+diamondprice);
	}

	private static int diamond_DC(int[] sell, int[] cut, int w) {
		if(w==0) return 0;
		else {
			for(int i=1; i<=w; i++) {
				int maxTemp=0;
				for(int k=1; k<=i; k++) {
					if(i==4) {
						System.out.println(i+" "+k+" " +sell[k-1]+" "+cut[i-1]);
						maxTemp = MAX(maxTemp,sell[k-1]+maxPrice[i-k]);
						maxPrice[i]=maxTemp;    
					}else {
					System.out.println(i+" "+k+" " +sell[k-1]+" "+cut[i-1]);
					maxTemp = MAX(maxTemp,sell[k-1]+maxPrice[i-k]-cut[i-1]);
					maxPrice[i]=maxTemp;    
					}
				}
			}
			return maxPrice[w];
		}
	}

	private static int MAX(int x, int y) {
		if(x>y) return x;
		else return y;
	}

}
