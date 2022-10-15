fun main(){
    val (r,c) = readln().split(" ").map { it.toInt() }
    val list = mutableListOf<List<String>>()
    val answer = mutableListOf<String>()
    repeat(r){
        val input = readln()
        answer.addAll(input.split("#").filterNot { it.isEmpty() || it.length<2})
        val temp = input.chunked(1).map { it }
        list.add(temp)
    }

    var temp = ""
    for (i in 0 until c) {
        for( j in 0 until r){
            temp += list[j][i]
        }
        answer.addAll(temp.split("#").filterNot { it.isEmpty() || it.length <2})
        temp=""
    }

    println(answer.filter { it.length >= 2 }.sorted()[0])
}
