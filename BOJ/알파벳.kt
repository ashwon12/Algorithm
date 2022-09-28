/** 백트래킹 알고리즘을 익히기 위한 푼 예졔
 *  dfs를 사용하여 문제를 풀다 가지치기를 한다.
 *  1. 알파벳이 이미 있는지 확인하는 visited
 *  2. 큐에 좌표와 그 때까지 지나 온 알파벳들을 연결한 문자열을 넣는다.
 *  3. 이미 집합에 알파벳이 있다면 해당 가지를 버린다.
 * **/


var r = -1
var c = -1
val visited = MutableList(26){false}
lateinit var board : Array<Array<Int>>
var maxDepth = -1
val dx = intArrayOf(0,0,1,-1)
val dy = intArrayOf(1,-1,0,0)

fun main(){
    val temp  = readln().split(" ").map { it.toInt() }
    r = temp[0]
    c = temp[1]

    board = Array(r){ Array(c){-1} }
    repeat(r){x ->
        val alpa = readln()
        repeat(c){y ->
            board[x][y] = alpa[y] - 'A'
        }
    }

    visited[board[0][0]] = true
    dfs(0,0,1)

    println(maxDepth)

}

fun dfs(x: Int, y: Int, depth: Int) {
    maxDepth = maxDepth.coerceAtLeast(depth)

    for (i in 0 until 4) {
        val nx = x + dx[i]
        val ny = y + dy[i]

        if (nx !in 0 until r || ny !in 0 until c) continue
        if(visited[board[nx][ny]]) continue

        visited[board[nx][ny]] = true
        dfs(nx, ny, depth + 1)
        visited[board[nx][ny]] = false
    }
}
