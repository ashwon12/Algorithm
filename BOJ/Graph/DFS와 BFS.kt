/** 백준 1260 **/

fun main(){
    val (n,m,v) = readln().split(" ").map { it.toInt() }
    val graph = Array(n+1) { mutableListOf<Int>() }
    repeat(m){
        // [[], [1번과 인접한 정점], [2번과 인접한 정점..], .....
        val (a,b) = readln().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }

    dfs(graph,n,v)
    println()
    bfs(graph,n,v)
}

fun dfs(graph : Array<MutableList<Int>>,size : Int,start : Int){
    val visited = Array(size+1){false}
    val stack = mutableListOf<Int>()

    graph.forEach { it.sortDescending() } // 스택은 위에서부터 꺼내기 때문에 큰 숫자부터 넣어주어야 한다.

    stack.add(start) // 초기정점 스택에 넣어주기
    print("$start ")
    visited[start] = true // 초기 정점은 자동으로 방문

    while (stack.isNotEmpty()){ // 스택이 빌때까지 반복.
        val top = stack.removeLast() // pop!!!
        if (!visited[top]){ // 현재 top이 방문했는지 확인
            print("$top ")
            visited[top] = true
        }
        graph[top].forEach { //현재 top과 인접한 얘들 반복
            if (!visited[it]) {
                stack.add(it)
            }
        }
    }
}

fun bfs(graph : Array<MutableList<Int>>,size : Int,start : Int){
    graph.forEach { it.sort() }
    val visited = Array(size+1){false}
    val queue = mutableListOf<Int>()

    queue.add(start) // 초기 정점 큐에 추가
    visited[start] = true // 초기 정점 자동 방문
    print("$start ")

    while (queue.isNotEmpty()){ //큐가 완전히 빌 때까지 반복
        val front = queue.removeFirst() // 맨앞 가져오기
        graph[front].forEach { // 맨앞에 있는 값과 인접한 얘들 전부 queue에 넣기
            if (!visited[it]){
                queue.add(it)
                visited[it] = true
                print("$it ")
            }
        }
    }
}
