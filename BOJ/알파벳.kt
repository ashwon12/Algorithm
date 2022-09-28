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
