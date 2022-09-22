/**
 *  사용 알고리즘 : bfs
 *  문제 해결 방법 :
 *  ex) 1~2 / 3 
 *  1. 1부터 시작해서 인접 노드를 탐색하고 완료가 되면 방문한 노드 정보를 반환 & count++
 *  2. 방문하지 않은 노드를 시작점으로 다시 탐색
 *  3. 1~2번을 모든 노드를 방문할 때까지 반복
 */

class Solution {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = 0
        var visited = Array(n){false}

        while(!visited.all{it}){
            visited = bfs(computers,visited,visited.indexOf(false))
            answer++
        }
        return answer
    }


    fun bfs(graph : Array<IntArray>,visited : Array<Boolean>,start : Int) : Array<Boolean>{
        val queue = mutableListOf<Int>()
        queue.add(start) // 초기 정점 큐에 추가
        visited[start] = true // 초기 정점 자동 방문

        while (queue.isNotEmpty()){ //큐가 완전히 빌 때까지 반복
            val front = queue.removeFirst() // 맨앞 가져오기
            graph[front].forEachIndexed { index, i ->
                if(i == 1 && !visited[index]){
                    queue.add(index)
                    visited[index] = true
                }
            }
        }
        return visited
    }
}
