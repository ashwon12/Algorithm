
public class Floyd_Warchall {
	
	private static int V = 4; // 정점의 갯수
	private static int INF =9999999; // 무한대의 숫자
	private static int D[][] ={ 
							{0,INF,2,INF},
							{1,0,INF,INF},
							{INF,8,0,3},
							{6,4,INF,0}	
							};

	public static void main(String[] args) {
		floyd(); 
	}

	private static void floyd() {
		
		//k = 중간노드, i=시작노드 , j=도착노드
		for(int k=0; k<V; k++) {
			for(int i=0; i<V; i++) {
				for(int j=0; j<V; j++) {
					if(i==j) {
						D[i][j]=0;
					}else {
						D[i][j]= MIN(D[i][j],D[i][k]+D[k][j]);
					}
					
				}
			}
		}

		//출력
		print();
		
	}
	

	private static void print() {
		for(int i=0; i<V; i++) {
			for(int j=0; j<V; j++) {
				System.out.println((i+1)+"부터"+(j+1)+"까지의 최단경로는"+D[i][j] +"입니다");
			}
		}
	}

	private static int MIN(int i, int j) {
		if(i>j) return j;
		else return i;
	}

}
