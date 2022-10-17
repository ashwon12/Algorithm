fun main(){
    while (true){
        val input = readln().split(" ").map { it.toInt() }.sorted()
        if (input.all { it == 0 }){ break }
        if (input[2]*input[2] == input[0]*input[0] + input[1]*input[1]){
            println("right")
        }else{
            println("wrong")
        }
    }
}
