import kotlin.math.*

/**
 * 사용할 알고리즘 : DFS ( 모든 노드 탐색하기 )
 * ex) 1,3의 간선을 끊었을 경우
 * 1. 인접 노드에서 3을 제외하고 1에서의 모든 노트 탐색
 * 2. 인접 노드에서 1을 제외하고 3에서의 모든 노드 탐색
 * 1과 2의 갯수를 뺀 값의 절댓값 구하기
 * 
 * 코드 설계
 * 추가할 변수 - graph (인덱스의 인접한 노드를 나타내는 변수 : Array<MutableList<Int>>) 
 * 추가할 함수 - dfs(start, graph) : Int (start 지점에서의 모든 노드를 탐색하는 함수, 함수에서 탐색한 노드의 갯수를 반환)
 * 
 * 1. graph 함수에 값 넣어주기
 * 2. wries 순회하면서 dfs 함수 호출
 * 3. answer에 이전값과 비교 후 더 작은 값으로 갱신
 */

class Solution {
    fun solution(n: Int, wires: Array<IntArray>): Int {
        var answer: Int = n+1
        val graph = Array(n+1){mutableListOf<Int>()}
        wires.forEach{ 
            graph[it[0]].add(it[1])
            graph[it[1]].add(it[0])
        }
        wires.forEach{
            graph[it[0]].remove(it[1])
            val a = dfs(it[0],graph)
            graph[it[0]].add(it[1])
            graph[it[1]].remove(it[0])
            val b = dfs(it[1],graph)
            graph[it[1]].add(it[0])
            answer = min(answer,abs(a-b))
        }
        
        return answer
    }
    
    fun dfs(start : Int, graph : Array<MutableList<Int>>) : Int {
        val size = graph.size
        val visited = Array(size+1){false}
        val stack = mutableListOf<Int>()

        graph.forEach { it.sortDescending() }

        stack.add(start)
        visited[start] = true

        while (stack.isNotEmpty()){
            val top = stack.removeLast()
            if (!visited[top]){
                visited[top] = true
            }
            graph[top].forEach {
                if (!visited[it]) {
                    stack.add(it)
                }
            }
        }
        return visited.filter{ it }.size
    }
}
