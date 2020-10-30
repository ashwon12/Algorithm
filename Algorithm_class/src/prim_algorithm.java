
public class prim_algorithm {
	
	private static int V = 7; // 정점의 갯수
	private static int INF =9999999; // 무한대의 숫자
	private static int dist[][] ={ 
						  {0,29,INF,INF,INF,10,INF},
						  {29,0,16,INF,INF,INF,15},
						  {INF,16,0,12,INF,INF,INF},
						  {INF,INF,12,0,22,INF,18},
						  {INF,INF,INF,22,0,27,25},
						  {10,INF,INF,INF,27,0,INF},
						  {INF,15,INF,18,25,INF,0}
						};
	private static boolean isSelected[] = new boolean[V]; // 정점이 선택됐는지 안됐는지 표시
	private static int T[] = new int[V]; //  최소의 거리 정보만 담는 배열, 매번 갱신
	

	public static void main(String[] args) {
		prim(0, V);
	}


	private static void prim(int s, int n) {
		int j;
		
		//배열 초기화
		for(int i=0; i<n; i++) {
			T[i]=INF;
			isSelected[i]=false;
		}
		T[s]=0; // 자기 자신을 순환하는 경로는 없다
		
		for(int k=0; k<n; k++) {
			j = get_min_vertex(k);
			isSelected[j] = true; // 최소거리를 갖는 정점의 정보(u)를 알아냈으니 해당 정점을 선택했다고 표시한다.
			 
		     
		    System.out.println("방문한 정점 :"+ j+"n :"+k ); // 방문한 정점(u)을 출력한다.
		 
		    for (int v = 0; v < n; v++)  // 이 과정은 우리가 새롭게 발견한 정보를 저장하는 과정이다.
		    // 직접적인 경로가 발견되어 INF 에서 상수거리로 바뀌는 과정과
		    // 기존의 상수거리보다 더 짧은 거리가 발견되 그 정보를 갱신하는 과정이 포함되어 있다.
		    {
		      // 선택된 u 정점을 기준으로 정점(u)과 연결되어 있는 정점까지의 거리를 각각 비교한다.
		      if (dist[j][v] != INF)  // 정점 u와 연결이 되어있고
		      {
		        // 아직 선택되지 않았으며 해당 변(weight[u][v])의 길이가 기존의 dist[v] 값보다 작다면
		        if (isSelected[v] == false && dist[j][v] < T[v])
		          T[v] = dist[j][v]; // dist[v]의 값을 갱신해준다.
		 
		        // 새롭게 발견되는 정점들이 초반에 저장될 수 있는 건 INF를 1000으로 설정해줬기 때문이다.
		        // 우리가 만든 그래프의 경로값들은 전부 100이하의 값이기 때문에 새롭게 발견되는 정점이 있다면
		        // 우선 등록되고 그 후 더 짧은 거리가 등장하면 갱신되는 형태로 이 프로그램은 작동한다.
		      }
		    }
		}
	}


	private static int get_min_vertex(int n) {
		int newV=0;
		
		for(int i=0; i<n; i++) {
			if(isSelected[i] == false) {
				newV=i;
				break;
			}
		}
		
		for(int i=0; i<n; i++) {
			if (isSelected[i] = false && (T[i] < T[newV])) {
				newV = i;  // 더 적은 거리가 존재한다면 해당 정점을 저장한다.
			 }
		}
		return(newV); 
	}

}
